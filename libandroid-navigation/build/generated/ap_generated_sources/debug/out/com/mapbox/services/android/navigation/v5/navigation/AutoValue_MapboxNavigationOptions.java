

package com.mapbox.services.android.navigation.v5.navigation;

import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import com.mapbox.services.android.navigation.v5.navigation.notification.NavigationNotification;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_MapboxNavigationOptions extends MapboxNavigationOptions {

  private final boolean defaultMilestonesEnabled;
  private final boolean enableFasterRouteDetection;
  private final boolean enableAutoIncrementLegIndex;
  private final boolean enableRefreshRoute;
  private final long refreshIntervalInMilliseconds;
  private final boolean isFromNavigationUi;
  private final boolean isDebugLoggingEnabled;
  private final NavigationNotification navigationNotification;
  private final int roundingIncrement;
  private final int timeFormatType;
  private final int navigationLocationEngineIntervalLagInMilliseconds;
  private final int defaultNotificationColorId;
  private final float offRouteThreshold;
  private final float offRouteThresholdWhenNearIntersection;
  private final float intersectionRadiusForOffRouteDetection;

  private AutoValue_MapboxNavigationOptions(
      boolean defaultMilestonesEnabled,
      boolean enableFasterRouteDetection,
      boolean enableAutoIncrementLegIndex,
      boolean enableRefreshRoute,
      long refreshIntervalInMilliseconds,
      boolean isFromNavigationUi,
      boolean isDebugLoggingEnabled,
      @Nullable NavigationNotification navigationNotification,
      int roundingIncrement,
      int timeFormatType,
      int navigationLocationEngineIntervalLagInMilliseconds,
      int defaultNotificationColorId,
      float offRouteThreshold,
      float offRouteThresholdWhenNearIntersection,
      float intersectionRadiusForOffRouteDetection) {
    this.defaultMilestonesEnabled = defaultMilestonesEnabled;
    this.enableFasterRouteDetection = enableFasterRouteDetection;
    this.enableAutoIncrementLegIndex = enableAutoIncrementLegIndex;
    this.enableRefreshRoute = enableRefreshRoute;
    this.refreshIntervalInMilliseconds = refreshIntervalInMilliseconds;
    this.isFromNavigationUi = isFromNavigationUi;
    this.isDebugLoggingEnabled = isDebugLoggingEnabled;
    this.navigationNotification = navigationNotification;
    this.roundingIncrement = roundingIncrement;
    this.timeFormatType = timeFormatType;
    this.navigationLocationEngineIntervalLagInMilliseconds = navigationLocationEngineIntervalLagInMilliseconds;
    this.defaultNotificationColorId = defaultNotificationColorId;
    this.offRouteThreshold = offRouteThreshold;
    this.offRouteThresholdWhenNearIntersection = offRouteThresholdWhenNearIntersection;
    this.intersectionRadiusForOffRouteDetection = intersectionRadiusForOffRouteDetection;
  }

  @Override
  public boolean defaultMilestonesEnabled() {
    return defaultMilestonesEnabled;
  }

  @Override
  public boolean enableFasterRouteDetection() {
    return enableFasterRouteDetection;
  }

  @Override
  public boolean enableAutoIncrementLegIndex() {
    return enableAutoIncrementLegIndex;
  }

  @Override
  public boolean enableRefreshRoute() {
    return enableRefreshRoute;
  }

  @Override
  public long refreshIntervalInMilliseconds() {
    return refreshIntervalInMilliseconds;
  }

  @Override
  public boolean isFromNavigationUi() {
    return isFromNavigationUi;
  }

  @Override
  public boolean isDebugLoggingEnabled() {
    return isDebugLoggingEnabled;
  }

  @Nullable
  @Override
  public NavigationNotification navigationNotification() {
    return navigationNotification;
  }

  @NavigationConstants.RoundingIncrement
  @Override
  public int roundingIncrement() {
    return roundingIncrement;
  }

  @NavigationTimeFormat.Type
  @Override
  public int timeFormatType() {
    return timeFormatType;
  }

  @Override
  public int navigationLocationEngineIntervalLagInMilliseconds() {
    return navigationLocationEngineIntervalLagInMilliseconds;
  }

  @ColorRes
  @Override
  public int defaultNotificationColorId() {
    return defaultNotificationColorId;
  }

  @Override
  public float offRouteThreshold() {
    return offRouteThreshold;
  }

  @Override
  public float offRouteThresholdWhenNearIntersection() {
    return offRouteThresholdWhenNearIntersection;
  }

  @Override
  public float intersectionRadiusForOffRouteDetection() {
    return intersectionRadiusForOffRouteDetection;
  }

  @Override
  public String toString() {
    return "MapboxNavigationOptions{"
         + "defaultMilestonesEnabled=" + defaultMilestonesEnabled + ", "
         + "enableFasterRouteDetection=" + enableFasterRouteDetection + ", "
         + "enableAutoIncrementLegIndex=" + enableAutoIncrementLegIndex + ", "
         + "enableRefreshRoute=" + enableRefreshRoute + ", "
         + "refreshIntervalInMilliseconds=" + refreshIntervalInMilliseconds + ", "
         + "isFromNavigationUi=" + isFromNavigationUi + ", "
         + "isDebugLoggingEnabled=" + isDebugLoggingEnabled + ", "
         + "navigationNotification=" + navigationNotification + ", "
         + "roundingIncrement=" + roundingIncrement + ", "
         + "timeFormatType=" + timeFormatType + ", "
         + "navigationLocationEngineIntervalLagInMilliseconds=" + navigationLocationEngineIntervalLagInMilliseconds + ", "
         + "defaultNotificationColorId=" + defaultNotificationColorId + ", "
         + "offRouteThreshold=" + offRouteThreshold + ", "
         + "offRouteThresholdWhenNearIntersection=" + offRouteThresholdWhenNearIntersection + ", "
         + "intersectionRadiusForOffRouteDetection=" + intersectionRadiusForOffRouteDetection
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MapboxNavigationOptions) {
      MapboxNavigationOptions that = (MapboxNavigationOptions) o;
      return (this.defaultMilestonesEnabled == that.defaultMilestonesEnabled())
           && (this.enableFasterRouteDetection == that.enableFasterRouteDetection())
           && (this.enableAutoIncrementLegIndex == that.enableAutoIncrementLegIndex())
           && (this.enableRefreshRoute == that.enableRefreshRoute())
           && (this.refreshIntervalInMilliseconds == that.refreshIntervalInMilliseconds())
           && (this.isFromNavigationUi == that.isFromNavigationUi())
           && (this.isDebugLoggingEnabled == that.isDebugLoggingEnabled())
           && ((this.navigationNotification == null) ? (that.navigationNotification() == null) : this.navigationNotification.equals(that.navigationNotification()))
           && (this.roundingIncrement == that.roundingIncrement())
           && (this.timeFormatType == that.timeFormatType())
           && (this.navigationLocationEngineIntervalLagInMilliseconds == that.navigationLocationEngineIntervalLagInMilliseconds())
           && (this.defaultNotificationColorId == that.defaultNotificationColorId())
           && (Float.floatToIntBits(this.offRouteThreshold) == Float.floatToIntBits(that.offRouteThreshold()))
           && (Float.floatToIntBits(this.offRouteThresholdWhenNearIntersection) == Float.floatToIntBits(that.offRouteThresholdWhenNearIntersection()))
           && (Float.floatToIntBits(this.intersectionRadiusForOffRouteDetection) == Float.floatToIntBits(that.intersectionRadiusForOffRouteDetection()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= defaultMilestonesEnabled ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableFasterRouteDetection ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableAutoIncrementLegIndex ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= enableRefreshRoute ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (int) ((refreshIntervalInMilliseconds >>> 32) ^ refreshIntervalInMilliseconds);
    h$ *= 1000003;
    h$ ^= isFromNavigationUi ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= isDebugLoggingEnabled ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (navigationNotification == null) ? 0 : navigationNotification.hashCode();
    h$ *= 1000003;
    h$ ^= roundingIncrement;
    h$ *= 1000003;
    h$ ^= timeFormatType;
    h$ *= 1000003;
    h$ ^= navigationLocationEngineIntervalLagInMilliseconds;
    h$ *= 1000003;
    h$ ^= defaultNotificationColorId;
    h$ *= 1000003;
    h$ ^= Float.floatToIntBits(offRouteThreshold);
    h$ *= 1000003;
    h$ ^= Float.floatToIntBits(offRouteThresholdWhenNearIntersection);
    h$ *= 1000003;
    h$ ^= Float.floatToIntBits(intersectionRadiusForOffRouteDetection);
    return h$;
  }

  @Override
  public MapboxNavigationOptions.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends MapboxNavigationOptions.Builder {
    private Boolean defaultMilestonesEnabled;
    private Boolean enableFasterRouteDetection;
    private Boolean enableAutoIncrementLegIndex;
    private Boolean enableRefreshRoute;
    private Long refreshIntervalInMilliseconds;
    private Boolean isFromNavigationUi;
    private Boolean isDebugLoggingEnabled;
    private NavigationNotification navigationNotification;
    private Integer roundingIncrement;
    private Integer timeFormatType;
    private Integer navigationLocationEngineIntervalLagInMilliseconds;
    private Integer defaultNotificationColorId;
    private Float offRouteThreshold;
    private Float offRouteThresholdWhenNearIntersection;
    private Float intersectionRadiusForOffRouteDetection;
    Builder() {
    }
    private Builder(MapboxNavigationOptions source) {
      this.defaultMilestonesEnabled = source.defaultMilestonesEnabled();
      this.enableFasterRouteDetection = source.enableFasterRouteDetection();
      this.enableAutoIncrementLegIndex = source.enableAutoIncrementLegIndex();
      this.enableRefreshRoute = source.enableRefreshRoute();
      this.refreshIntervalInMilliseconds = source.refreshIntervalInMilliseconds();
      this.isFromNavigationUi = source.isFromNavigationUi();
      this.isDebugLoggingEnabled = source.isDebugLoggingEnabled();
      this.navigationNotification = source.navigationNotification();
      this.roundingIncrement = source.roundingIncrement();
      this.timeFormatType = source.timeFormatType();
      this.navigationLocationEngineIntervalLagInMilliseconds = source.navigationLocationEngineIntervalLagInMilliseconds();
      this.defaultNotificationColorId = source.defaultNotificationColorId();
      this.offRouteThreshold = source.offRouteThreshold();
      this.offRouteThresholdWhenNearIntersection = source.offRouteThresholdWhenNearIntersection();
      this.intersectionRadiusForOffRouteDetection = source.intersectionRadiusForOffRouteDetection();
    }
    @Override
    public MapboxNavigationOptions.Builder defaultMilestonesEnabled(boolean defaultMilestonesEnabled) {
      this.defaultMilestonesEnabled = defaultMilestonesEnabled;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder enableFasterRouteDetection(boolean enableFasterRouteDetection) {
      this.enableFasterRouteDetection = enableFasterRouteDetection;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder enableAutoIncrementLegIndex(boolean enableAutoIncrementLegIndex) {
      this.enableAutoIncrementLegIndex = enableAutoIncrementLegIndex;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder enableRefreshRoute(boolean enableRefreshRoute) {
      this.enableRefreshRoute = enableRefreshRoute;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder refreshIntervalInMilliseconds(long refreshIntervalInMilliseconds) {
      this.refreshIntervalInMilliseconds = refreshIntervalInMilliseconds;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder isFromNavigationUi(boolean isFromNavigationUi) {
      this.isFromNavigationUi = isFromNavigationUi;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder isDebugLoggingEnabled(boolean isDebugLoggingEnabled) {
      this.isDebugLoggingEnabled = isDebugLoggingEnabled;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder navigationNotification(@Nullable NavigationNotification navigationNotification) {
      this.navigationNotification = navigationNotification;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder roundingIncrement(int roundingIncrement) {
      this.roundingIncrement = roundingIncrement;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder timeFormatType(int timeFormatType) {
      this.timeFormatType = timeFormatType;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder navigationLocationEngineIntervalLagInMilliseconds(int navigationLocationEngineIntervalLagInMilliseconds) {
      this.navigationLocationEngineIntervalLagInMilliseconds = navigationLocationEngineIntervalLagInMilliseconds;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder defaultNotificationColorId(int defaultNotificationColorId) {
      this.defaultNotificationColorId = defaultNotificationColorId;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder offRouteThreshold(float offRouteThreshold) {
      this.offRouteThreshold = offRouteThreshold;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder offRouteThresholdWhenNearIntersection(float offRouteThresholdWhenNearIntersection) {
      this.offRouteThresholdWhenNearIntersection = offRouteThresholdWhenNearIntersection;
      return this;
    }
    @Override
    public MapboxNavigationOptions.Builder intersectionRadiusForOffRouteDetection(float intersectionRadiusForOffRouteDetection) {
      this.intersectionRadiusForOffRouteDetection = intersectionRadiusForOffRouteDetection;
      return this;
    }
    @Override
    public MapboxNavigationOptions build() {
      String missing = "";
      if (this.defaultMilestonesEnabled == null) {
        missing += " defaultMilestonesEnabled";
      }
      if (this.enableFasterRouteDetection == null) {
        missing += " enableFasterRouteDetection";
      }
      if (this.enableAutoIncrementLegIndex == null) {
        missing += " enableAutoIncrementLegIndex";
      }
      if (this.enableRefreshRoute == null) {
        missing += " enableRefreshRoute";
      }
      if (this.refreshIntervalInMilliseconds == null) {
        missing += " refreshIntervalInMilliseconds";
      }
      if (this.isFromNavigationUi == null) {
        missing += " isFromNavigationUi";
      }
      if (this.isDebugLoggingEnabled == null) {
        missing += " isDebugLoggingEnabled";
      }
      if (this.roundingIncrement == null) {
        missing += " roundingIncrement";
      }
      if (this.timeFormatType == null) {
        missing += " timeFormatType";
      }
      if (this.navigationLocationEngineIntervalLagInMilliseconds == null) {
        missing += " navigationLocationEngineIntervalLagInMilliseconds";
      }
      if (this.defaultNotificationColorId == null) {
        missing += " defaultNotificationColorId";
      }
      if (this.offRouteThreshold == null) {
        missing += " offRouteThreshold";
      }
      if (this.offRouteThresholdWhenNearIntersection == null) {
        missing += " offRouteThresholdWhenNearIntersection";
      }
      if (this.intersectionRadiusForOffRouteDetection == null) {
        missing += " intersectionRadiusForOffRouteDetection";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_MapboxNavigationOptions(
          this.defaultMilestonesEnabled,
          this.enableFasterRouteDetection,
          this.enableAutoIncrementLegIndex,
          this.enableRefreshRoute,
          this.refreshIntervalInMilliseconds,
          this.isFromNavigationUi,
          this.isDebugLoggingEnabled,
          this.navigationNotification,
          this.roundingIncrement,
          this.timeFormatType,
          this.navigationLocationEngineIntervalLagInMilliseconds,
          this.defaultNotificationColorId,
          this.offRouteThreshold,
          this.offRouteThresholdWhenNearIntersection,
          this.intersectionRadiusForOffRouteDetection);
    }
  }

}
