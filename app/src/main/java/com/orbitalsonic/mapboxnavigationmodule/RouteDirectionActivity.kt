package com.orbitalsonic.mapboxnavigationmodule

import android.app.Dialog
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.mapbox.android.core.permissions.PermissionsListener
import com.mapbox.android.core.permissions.PermissionsManager
import com.mapbox.api.directions.v5.DirectionsCriteria
import com.mapbox.api.directions.v5.models.DirectionsResponse
import com.mapbox.api.directions.v5.models.DirectionsRoute
import com.mapbox.geojson.Point
import com.mapbox.mapboxsdk.annotations.IconFactory
import com.mapbox.mapboxsdk.annotations.MarkerOptions
import com.mapbox.mapboxsdk.camera.CameraPosition
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory
import com.mapbox.mapboxsdk.geometry.LatLng
import com.mapbox.mapboxsdk.geometry.LatLngBounds
import com.mapbox.mapboxsdk.location.LocationComponentActivationOptions
import com.mapbox.mapboxsdk.location.LocationComponentOptions
import com.mapbox.mapboxsdk.location.modes.CameraMode
import com.mapbox.mapboxsdk.location.modes.RenderMode
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import com.mapbox.mapboxsdk.maps.Style
import com.mapbox.services.android.navigation.ui.v5.NavigationLauncher
import com.mapbox.services.android.navigation.ui.v5.NavigationLauncherOptions
import com.mapbox.services.android.navigation.ui.v5.route.NavigationMapRoute
import com.mapbox.services.android.navigation.v5.navigation.NavigationRoute
import com.orbitalsonic.mapboxnavigationmodule.ConstantsUtils.locationDestination
import com.orbitalsonic.mapboxnavigationmodule.ConstantsUtils.locationStart
import com.orbitalsonic.mapboxnavigationmodule.ScreenUtils.getScreenHeight
import com.orbitalsonic.mapboxnavigationmodule.ScreenUtils.getScreenWidth
import com.orbitalsonic.mapboxnavigationmodule.databinding.ActivityRouteDirectionBinding
import com.orbitalsonic.mapboxnavigationmodule.databinding.DialogProgressBinding
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RouteDirectionActivity : AppCompatActivity(), OnMapReadyCallback,
    PermissionsListener {

    private lateinit var binding: ActivityRouteDirectionBinding
    private val mapTag = "RouteDirectionTag"

    private val handler = CoroutineExceptionHandler { _, exception ->
        Log.e(mapTag, "$exception")
    }

    private var progressDialog: Dialog? = null

    private lateinit var map: MapboxMap
    private var permissionsManager: PermissionsManager = PermissionsManager(this)
    private var currentRoute: DirectionsRoute? = null
    private var navigationMapRoute: NavigationMapRoute? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_route_direction)

        binding.mapViewRfd.getMapAsync(this)
        onClickMethods()
        initProgressDialog()
    }

    private fun onClickMethods() {
        binding.btnStartNavigation.setOnClickListener {

            if (currentRoute != null) {
                binding.btnStartNavigation.isEnabled = false
                val position = CameraPosition.Builder()
                    .target(
                        LatLng(
                            locationStart.placeLatitude,
                            locationStart.placeLongitude
                        )
                    )
                    .zoom(13.0) // Sets the zoom
                    .bearing(0.0) // Rotate the camera
                    .tilt(0.0) // Set the camera tilt
                    .build()

                try {
                    val navigationLauncherOptions = NavigationLauncherOptions.builder() //1
                        .directionsRoute(currentRoute) //2
                        .shouldSimulateRoute(false) //3
                        .initialMapCameraPosition(position)
                        .build()

                    NavigationLauncher.startNavigation(
                        this,
                        navigationLauncherOptions
                    ) //4
                } catch (e: Exception) {
                }

            }

        }
    }

    private fun initProgressDialog() {
        progressDialog = Dialog(this)
        val dialogBinding: DialogProgressBinding = DataBindingUtil.inflate(
            LayoutInflater.from(this), R.layout.dialog_progress, null, false
        )
        progressDialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        progressDialog?.setContentView(dialogBinding.root)
        progressDialog?.setCanceledOnTouchOutside(false)
        progressDialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        progressDialog?.setCancelable(false)

        dialogBinding.progressCard.requestLayout()
        dialogBinding.progressCard.layoutParams.width =
            (getScreenWidth() * .90).toInt()
        dialogBinding.progressCard.layoutParams.height =
            (getScreenHeight() * .10).toInt()

    }

    override fun onMapReady(mapboxMap: MapboxMap) {
        this.map = mapboxMap
        mapboxMap.setStyle(
            Style.Builder().fromUri("mapbox://styles/mapbox/streets-v11")
        ) {
            // Map is set up and the style has loaded. Now you can add data or make other map adjustments

            enableLocationComponent(it)
            Handler(Looper.getMainLooper()).postDelayed({
                drawRoute()
            }, 1000)

        }
    }

    override fun onExplanationNeeded(permissionsToExplain: MutableList<String>?) {}
    override fun onPermissionResult(granted: Boolean) {}

    @SuppressWarnings("MissingPermission")
    private fun enableLocationComponent(loadedMapStyle: Style) {
        // Check if permissions are enabled and if not request
        if (PermissionsManager.areLocationPermissionsGranted(this)) {
            // Create and customize the LocationComponent's options
            val customLocationComponentOptions = LocationComponentOptions.builder(this)
                .trackingGesturesManagement(true)
                .accuracyColor(ContextCompat.getColor(this, R.color.teal_200))
                .build()

            val locationComponentActivationOptions =
                LocationComponentActivationOptions.builder(this, loadedMapStyle)
                    .locationComponentOptions(customLocationComponentOptions)
                    .build()


            // Get an instance of the LocationComponent and then adjust its settings
            map.locationComponent.apply {

                // Activate the LocationComponent with options
                activateLocationComponent(locationComponentActivationOptions)

                // Enable to make the LocationComponent visible
                isLocationComponentEnabled = true

                // Set the LocationComponent's camera mode
                cameraMode = CameraMode.TRACKING

                // Set the LocationComponent's render mode
                renderMode = RenderMode.COMPASS
            }

            // Setup camera position
            /*    try {
                    val location = map.locationComponent.lastKnownLocation
                    if (location != null) {
                        updateCamera(location)

                    }
                }catch (e:Exception){
                    e.recordException(mapTag)
                }*/

            val bm: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.ic_red_marker)
            map.style?.addImage("place-marker", bm)

        } else {
            permissionsManager = PermissionsManager(this)
            permissionsManager.requestLocationPermissions(this)
        }


//        getRoute(Point.fromLngLat(71.6911, 29.3544), Point.fromLngLat(67.0011, 24.8607))
    }


    override fun onResume() {
        super.onResume()
        try {
            binding.btnStartNavigation.isEnabled = true
        } catch (e: Exception) {

        }

    }

    override fun onPause() {
        super.onPause()
        try {
            binding.btnStartNavigation.isEnabled = false
        } catch (e: Exception) {

        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }


    private fun addPlaceMarker(location: LatLng) {
        // Add symbol at specified lat/lon
        val markerOptions = MarkerOptions()
            .position(location)
        markerOptions.icon(IconFactory.getInstance(this).fromResource(R.drawable.ic_red_marker))
        markerOptions.title("Here")
        map.addMarker(markerOptions)
    }


    private fun updateCameraRoute(location: MapLocation) {

        val latLngBounds: LatLngBounds = LatLngBounds.Builder()
            .include(LatLng(locationStart.placeLatitude, locationStart.placeLongitude))
            .include(LatLng(locationDestination.placeLatitude, locationDestination.placeLongitude))
            .build()

        binding.btnStartNavigation.visibility = View.VISIBLE
        val position = CameraPosition.Builder()
            .target(LatLng(location.placeLatitude, location.placeLongitude))
            .zoom(15.0) // Sets the zoom
            .bearing(0.0) // Rotate the camera
            .tilt(0.0) // Set the camera tilt
            .build() // Creates a CameraPosition from the builder

        map.animateCamera(
            CameraUpdateFactory
                .newLatLngBounds(latLngBounds, 100, 200, 100, 200), 5000
        )
    }

    private fun drawRoute() {

        updateCameraRoute(locationStart)
        val startPoint =
            Point.fromLngLat(locationStart.placeLongitude, locationStart.placeLatitude)
        val endPoint =
            Point.fromLngLat(locationDestination.placeLongitude, locationDestination.placeLatitude)
        getRoute(startPoint, endPoint)

    }


    private fun getRoute(originPoint: Point, endPoint: Point) {
        progressDialog?.show()

        CoroutineScope(Dispatchers.Main + handler).launch {
            async(Dispatchers.IO + handler) {
                NavigationRoute.builder(this@RouteDirectionActivity) //1
                    .accessToken(resources.getString(R.string.mapbox_access_token)) //2
                    .profile(DirectionsCriteria.PROFILE_DRIVING)
                    .origin(originPoint) //3
                    .destination(endPoint) //4
                    .build() //5
                    .getRoute(object : Callback<DirectionsResponse> { //6
                        override fun onFailure(call: Call<DirectionsResponse>, t: Throwable) {

                        }

                        override fun onResponse(
                            call: Call<DirectionsResponse>,
                            response: Response<DirectionsResponse>
                        ) {
                            try {
                                if (navigationMapRoute != null) {
                                    navigationMapRoute?.updateRouteVisibilityTo(false)
                                } else {
                                    navigationMapRoute =
                                        NavigationMapRoute(null, binding.mapViewRfd, map)
                                }

                                currentRoute = response.body()?.routes()?.let {
                                    if (it.isNotEmpty()) {
                                        it[0]
                                    } else {
                                        null
                                    }

                                } ?: run {
                                    null
                                }
                                if (currentRoute != null) {
                                    addPlaceMarker(
                                        LatLng(
                                            locationDestination.placeLatitude,
                                            locationDestination.placeLongitude
                                        )
                                    )
                                    navigationMapRoute?.addRoute(currentRoute)
                                }

                            } catch (e: Exception) {
                                currentRoute = null
                            }
                            runOnUiThread {
                                binding.btnStartNavigation.visibility = View.VISIBLE
                            }
                        }
                    })

            }.await()
            runOnUiThread {
                progressDialog?.dismiss()
            }

        }

    }


}