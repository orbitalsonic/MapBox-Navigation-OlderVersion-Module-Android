

package com.mapbox.services.android.navigation.ui.v5;

import androidx.annotation.Nullable;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.mapboxsdk.camera.CameraPosition;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_NavigationLauncherOptions extends NavigationLauncherOptions {

  private final DirectionsRoute directionsRoute;
  private final Integer lightThemeResId;
  private final Integer darkThemeResId;
  private final boolean shouldSimulateRoute;
  private final boolean waynameChipEnabled;
  private final String offlineRoutingTilesPath;
  private final String offlineRoutingTilesVersion;
  private final MapOfflineOptions offlineMapOptions;
  private final CameraPosition initialMapCameraPosition;

  private AutoValue_NavigationLauncherOptions(
      DirectionsRoute directionsRoute,
      @Nullable Integer lightThemeResId,
      @Nullable Integer darkThemeResId,
      boolean shouldSimulateRoute,
      boolean waynameChipEnabled,
      @Nullable String offlineRoutingTilesPath,
      @Nullable String offlineRoutingTilesVersion,
      @Nullable MapOfflineOptions offlineMapOptions,
      @Nullable CameraPosition initialMapCameraPosition) {
    this.directionsRoute = directionsRoute;
    this.lightThemeResId = lightThemeResId;
    this.darkThemeResId = darkThemeResId;
    this.shouldSimulateRoute = shouldSimulateRoute;
    this.waynameChipEnabled = waynameChipEnabled;
    this.offlineRoutingTilesPath = offlineRoutingTilesPath;
    this.offlineRoutingTilesVersion = offlineRoutingTilesVersion;
    this.offlineMapOptions = offlineMapOptions;
    this.initialMapCameraPosition = initialMapCameraPosition;
  }

  @Override
  public DirectionsRoute directionsRoute() {
    return directionsRoute;
  }

  @Nullable
  @Override
  public Integer lightThemeResId() {
    return lightThemeResId;
  }

  @Nullable
  @Override
  public Integer darkThemeResId() {
    return darkThemeResId;
  }

  @Override
  public boolean shouldSimulateRoute() {
    return shouldSimulateRoute;
  }

  @Override
  public boolean waynameChipEnabled() {
    return waynameChipEnabled;
  }

  @Nullable
  @Override
  public String offlineRoutingTilesPath() {
    return offlineRoutingTilesPath;
  }

  @Nullable
  @Override
  public String offlineRoutingTilesVersion() {
    return offlineRoutingTilesVersion;
  }

  @Nullable
  @Override
  public MapOfflineOptions offlineMapOptions() {
    return offlineMapOptions;
  }

  @Nullable
  @Override
  public CameraPosition initialMapCameraPosition() {
    return initialMapCameraPosition;
  }

  @Override
  public String toString() {
    return "NavigationLauncherOptions{"
         + "directionsRoute=" + directionsRoute + ", "
         + "lightThemeResId=" + lightThemeResId + ", "
         + "darkThemeResId=" + darkThemeResId + ", "
         + "shouldSimulateRoute=" + shouldSimulateRoute + ", "
         + "waynameChipEnabled=" + waynameChipEnabled + ", "
         + "offlineRoutingTilesPath=" + offlineRoutingTilesPath + ", "
         + "offlineRoutingTilesVersion=" + offlineRoutingTilesVersion + ", "
         + "offlineMapOptions=" + offlineMapOptions + ", "
         + "initialMapCameraPosition=" + initialMapCameraPosition
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NavigationLauncherOptions) {
      NavigationLauncherOptions that = (NavigationLauncherOptions) o;
      return (this.directionsRoute.equals(that.directionsRoute()))
           && ((this.lightThemeResId == null) ? (that.lightThemeResId() == null) : this.lightThemeResId.equals(that.lightThemeResId()))
           && ((this.darkThemeResId == null) ? (that.darkThemeResId() == null) : this.darkThemeResId.equals(that.darkThemeResId()))
           && (this.shouldSimulateRoute == that.shouldSimulateRoute())
           && (this.waynameChipEnabled == that.waynameChipEnabled())
           && ((this.offlineRoutingTilesPath == null) ? (that.offlineRoutingTilesPath() == null) : this.offlineRoutingTilesPath.equals(that.offlineRoutingTilesPath()))
           && ((this.offlineRoutingTilesVersion == null) ? (that.offlineRoutingTilesVersion() == null) : this.offlineRoutingTilesVersion.equals(that.offlineRoutingTilesVersion()))
           && ((this.offlineMapOptions == null) ? (that.offlineMapOptions() == null) : this.offlineMapOptions.equals(that.offlineMapOptions()))
           && ((this.initialMapCameraPosition == null) ? (that.initialMapCameraPosition() == null) : this.initialMapCameraPosition.equals(that.initialMapCameraPosition()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= directionsRoute.hashCode();
    h$ *= 1000003;
    h$ ^= (lightThemeResId == null) ? 0 : lightThemeResId.hashCode();
    h$ *= 1000003;
    h$ ^= (darkThemeResId == null) ? 0 : darkThemeResId.hashCode();
    h$ *= 1000003;
    h$ ^= shouldSimulateRoute ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= waynameChipEnabled ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (offlineRoutingTilesPath == null) ? 0 : offlineRoutingTilesPath.hashCode();
    h$ *= 1000003;
    h$ ^= (offlineRoutingTilesVersion == null) ? 0 : offlineRoutingTilesVersion.hashCode();
    h$ *= 1000003;
    h$ ^= (offlineMapOptions == null) ? 0 : offlineMapOptions.hashCode();
    h$ *= 1000003;
    h$ ^= (initialMapCameraPosition == null) ? 0 : initialMapCameraPosition.hashCode();
    return h$;
  }

  static final class Builder extends NavigationLauncherOptions.Builder {
    private DirectionsRoute directionsRoute;
    private Integer lightThemeResId;
    private Integer darkThemeResId;
    private Boolean shouldSimulateRoute;
    private Boolean waynameChipEnabled;
    private String offlineRoutingTilesPath;
    private String offlineRoutingTilesVersion;
    private MapOfflineOptions offlineMapOptions;
    private CameraPosition initialMapCameraPosition;
    Builder() {
    }
    @Override
    public NavigationLauncherOptions.Builder directionsRoute(DirectionsRoute directionsRoute) {
      if (directionsRoute == null) {
        throw new NullPointerException("Null directionsRoute");
      }
      this.directionsRoute = directionsRoute;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder lightThemeResId(@Nullable Integer lightThemeResId) {
      this.lightThemeResId = lightThemeResId;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder darkThemeResId(@Nullable Integer darkThemeResId) {
      this.darkThemeResId = darkThemeResId;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder shouldSimulateRoute(boolean shouldSimulateRoute) {
      this.shouldSimulateRoute = shouldSimulateRoute;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder waynameChipEnabled(boolean waynameChipEnabled) {
      this.waynameChipEnabled = waynameChipEnabled;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder offlineRoutingTilesPath(@Nullable String offlineRoutingTilesPath) {
      this.offlineRoutingTilesPath = offlineRoutingTilesPath;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder offlineRoutingTilesVersion(@Nullable String offlineRoutingTilesVersion) {
      this.offlineRoutingTilesVersion = offlineRoutingTilesVersion;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder offlineMapOptions(@Nullable MapOfflineOptions offlineMapOptions) {
      this.offlineMapOptions = offlineMapOptions;
      return this;
    }
    @Override
    public NavigationLauncherOptions.Builder initialMapCameraPosition(@Nullable CameraPosition initialMapCameraPosition) {
      this.initialMapCameraPosition = initialMapCameraPosition;
      return this;
    }
    @Override
    public NavigationLauncherOptions build() {
      String missing = "";
      if (this.directionsRoute == null) {
        missing += " directionsRoute";
      }
      if (this.shouldSimulateRoute == null) {
        missing += " shouldSimulateRoute";
      }
      if (this.waynameChipEnabled == null) {
        missing += " waynameChipEnabled";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_NavigationLauncherOptions(
          this.directionsRoute,
          this.lightThemeResId,
          this.darkThemeResId,
          this.shouldSimulateRoute,
          this.waynameChipEnabled,
          this.offlineRoutingTilesPath,
          this.offlineRoutingTilesVersion,
          this.offlineMapOptions,
          this.initialMapCameraPosition);
    }
  }

}
