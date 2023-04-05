package com.orbitalsonic.mapboxnavigationmodule

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

class MainApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(this, getString(R.string.mapbox_access_token))

    }

}