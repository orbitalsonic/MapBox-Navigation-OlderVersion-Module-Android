

package com.mapbox.services.android.navigation.v5.navigation.metrics;

import android.location.Location;
import androidx.annotation.Nullable;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.services.android.navigation.v5.routeprogress.MetricsRouteProgress;
import java.util.Date;
import java.util.List;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_SessionState extends SessionState {

  private final int secondsSinceLastReroute;
  private final MetricsRouteProgress eventRouteProgress;
  private final Location eventLocation;
  private final Date eventDate;
  private final double eventRouteDistanceCompleted;
  private final List<Location> afterEventLocations;
  private final List<Location> beforeEventLocations;
  private final DirectionsRoute originalDirectionRoute;
  private final DirectionsRoute currentDirectionRoute;
  private final String sessionIdentifier;
  private final String tripIdentifier;
  private final String originalRequestIdentifier;
  private final String requestIdentifier;
  private final boolean mockLocation;
  private final int rerouteCount;
  private final Date startTimestamp;
  private final Date arrivalTimestamp;
  private final String locationEngineName;
  private final int percentInForeground;
  private final int percentInPortrait;

  private AutoValue_SessionState(
      int secondsSinceLastReroute,
      MetricsRouteProgress eventRouteProgress,
      @Nullable Location eventLocation,
      @Nullable Date eventDate,
      double eventRouteDistanceCompleted,
      @Nullable List<Location> afterEventLocations,
      @Nullable List<Location> beforeEventLocations,
      @Nullable DirectionsRoute originalDirectionRoute,
      @Nullable DirectionsRoute currentDirectionRoute,
      String sessionIdentifier,
      String tripIdentifier,
      @Nullable String originalRequestIdentifier,
      @Nullable String requestIdentifier,
      boolean mockLocation,
      int rerouteCount,
      @Nullable Date startTimestamp,
      @Nullable Date arrivalTimestamp,
      String locationEngineName,
      int percentInForeground,
      int percentInPortrait) {
    this.secondsSinceLastReroute = secondsSinceLastReroute;
    this.eventRouteProgress = eventRouteProgress;
    this.eventLocation = eventLocation;
    this.eventDate = eventDate;
    this.eventRouteDistanceCompleted = eventRouteDistanceCompleted;
    this.afterEventLocations = afterEventLocations;
    this.beforeEventLocations = beforeEventLocations;
    this.originalDirectionRoute = originalDirectionRoute;
    this.currentDirectionRoute = currentDirectionRoute;
    this.sessionIdentifier = sessionIdentifier;
    this.tripIdentifier = tripIdentifier;
    this.originalRequestIdentifier = originalRequestIdentifier;
    this.requestIdentifier = requestIdentifier;
    this.mockLocation = mockLocation;
    this.rerouteCount = rerouteCount;
    this.startTimestamp = startTimestamp;
    this.arrivalTimestamp = arrivalTimestamp;
    this.locationEngineName = locationEngineName;
    this.percentInForeground = percentInForeground;
    this.percentInPortrait = percentInPortrait;
  }

  @Override
  public int secondsSinceLastReroute() {
    return secondsSinceLastReroute;
  }

  @Override
  public MetricsRouteProgress eventRouteProgress() {
    return eventRouteProgress;
  }

  @Nullable
  @Override
  public Location eventLocation() {
    return eventLocation;
  }

  @Nullable
  @Override
  public Date eventDate() {
    return eventDate;
  }

  @Override
  public double eventRouteDistanceCompleted() {
    return eventRouteDistanceCompleted;
  }

  @Nullable
  @Override
  public List<Location> afterEventLocations() {
    return afterEventLocations;
  }

  @Nullable
  @Override
  public List<Location> beforeEventLocations() {
    return beforeEventLocations;
  }

  @Nullable
  @Override
  public DirectionsRoute originalDirectionRoute() {
    return originalDirectionRoute;
  }

  @Nullable
  @Override
  public DirectionsRoute currentDirectionRoute() {
    return currentDirectionRoute;
  }

  @Override
  public String sessionIdentifier() {
    return sessionIdentifier;
  }

  @Override
  public String tripIdentifier() {
    return tripIdentifier;
  }

  @Nullable
  @Override
  public String originalRequestIdentifier() {
    return originalRequestIdentifier;
  }

  @Nullable
  @Override
  public String requestIdentifier() {
    return requestIdentifier;
  }

  @Override
  public boolean mockLocation() {
    return mockLocation;
  }

  @Override
  public int rerouteCount() {
    return rerouteCount;
  }

  @Nullable
  @Override
  public Date startTimestamp() {
    return startTimestamp;
  }

  @Nullable
  @Override
  public Date arrivalTimestamp() {
    return arrivalTimestamp;
  }

  @Override
  public String locationEngineName() {
    return locationEngineName;
  }

  @Override
  public int percentInForeground() {
    return percentInForeground;
  }

  @Override
  public int percentInPortrait() {
    return percentInPortrait;
  }

  @Override
  public String toString() {
    return "SessionState{"
         + "secondsSinceLastReroute=" + secondsSinceLastReroute + ", "
         + "eventRouteProgress=" + eventRouteProgress + ", "
         + "eventLocation=" + eventLocation + ", "
         + "eventDate=" + eventDate + ", "
         + "eventRouteDistanceCompleted=" + eventRouteDistanceCompleted + ", "
         + "afterEventLocations=" + afterEventLocations + ", "
         + "beforeEventLocations=" + beforeEventLocations + ", "
         + "originalDirectionRoute=" + originalDirectionRoute + ", "
         + "currentDirectionRoute=" + currentDirectionRoute + ", "
         + "sessionIdentifier=" + sessionIdentifier + ", "
         + "tripIdentifier=" + tripIdentifier + ", "
         + "originalRequestIdentifier=" + originalRequestIdentifier + ", "
         + "requestIdentifier=" + requestIdentifier + ", "
         + "mockLocation=" + mockLocation + ", "
         + "rerouteCount=" + rerouteCount + ", "
         + "startTimestamp=" + startTimestamp + ", "
         + "arrivalTimestamp=" + arrivalTimestamp + ", "
         + "locationEngineName=" + locationEngineName + ", "
         + "percentInForeground=" + percentInForeground + ", "
         + "percentInPortrait=" + percentInPortrait
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SessionState) {
      SessionState that = (SessionState) o;
      return (this.secondsSinceLastReroute == that.secondsSinceLastReroute())
           && (this.eventRouteProgress.equals(that.eventRouteProgress()))
           && ((this.eventLocation == null) ? (that.eventLocation() == null) : this.eventLocation.equals(that.eventLocation()))
           && ((this.eventDate == null) ? (that.eventDate() == null) : this.eventDate.equals(that.eventDate()))
           && (Double.doubleToLongBits(this.eventRouteDistanceCompleted) == Double.doubleToLongBits(that.eventRouteDistanceCompleted()))
           && ((this.afterEventLocations == null) ? (that.afterEventLocations() == null) : this.afterEventLocations.equals(that.afterEventLocations()))
           && ((this.beforeEventLocations == null) ? (that.beforeEventLocations() == null) : this.beforeEventLocations.equals(that.beforeEventLocations()))
           && ((this.originalDirectionRoute == null) ? (that.originalDirectionRoute() == null) : this.originalDirectionRoute.equals(that.originalDirectionRoute()))
           && ((this.currentDirectionRoute == null) ? (that.currentDirectionRoute() == null) : this.currentDirectionRoute.equals(that.currentDirectionRoute()))
           && (this.sessionIdentifier.equals(that.sessionIdentifier()))
           && (this.tripIdentifier.equals(that.tripIdentifier()))
           && ((this.originalRequestIdentifier == null) ? (that.originalRequestIdentifier() == null) : this.originalRequestIdentifier.equals(that.originalRequestIdentifier()))
           && ((this.requestIdentifier == null) ? (that.requestIdentifier() == null) : this.requestIdentifier.equals(that.requestIdentifier()))
           && (this.mockLocation == that.mockLocation())
           && (this.rerouteCount == that.rerouteCount())
           && ((this.startTimestamp == null) ? (that.startTimestamp() == null) : this.startTimestamp.equals(that.startTimestamp()))
           && ((this.arrivalTimestamp == null) ? (that.arrivalTimestamp() == null) : this.arrivalTimestamp.equals(that.arrivalTimestamp()))
           && (this.locationEngineName.equals(that.locationEngineName()))
           && (this.percentInForeground == that.percentInForeground())
           && (this.percentInPortrait == that.percentInPortrait());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= secondsSinceLastReroute;
    h$ *= 1000003;
    h$ ^= eventRouteProgress.hashCode();
    h$ *= 1000003;
    h$ ^= (eventLocation == null) ? 0 : eventLocation.hashCode();
    h$ *= 1000003;
    h$ ^= (eventDate == null) ? 0 : eventDate.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(eventRouteDistanceCompleted) >>> 32) ^ Double.doubleToLongBits(eventRouteDistanceCompleted));
    h$ *= 1000003;
    h$ ^= (afterEventLocations == null) ? 0 : afterEventLocations.hashCode();
    h$ *= 1000003;
    h$ ^= (beforeEventLocations == null) ? 0 : beforeEventLocations.hashCode();
    h$ *= 1000003;
    h$ ^= (originalDirectionRoute == null) ? 0 : originalDirectionRoute.hashCode();
    h$ *= 1000003;
    h$ ^= (currentDirectionRoute == null) ? 0 : currentDirectionRoute.hashCode();
    h$ *= 1000003;
    h$ ^= sessionIdentifier.hashCode();
    h$ *= 1000003;
    h$ ^= tripIdentifier.hashCode();
    h$ *= 1000003;
    h$ ^= (originalRequestIdentifier == null) ? 0 : originalRequestIdentifier.hashCode();
    h$ *= 1000003;
    h$ ^= (requestIdentifier == null) ? 0 : requestIdentifier.hashCode();
    h$ *= 1000003;
    h$ ^= mockLocation ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= rerouteCount;
    h$ *= 1000003;
    h$ ^= (startTimestamp == null) ? 0 : startTimestamp.hashCode();
    h$ *= 1000003;
    h$ ^= (arrivalTimestamp == null) ? 0 : arrivalTimestamp.hashCode();
    h$ *= 1000003;
    h$ ^= locationEngineName.hashCode();
    h$ *= 1000003;
    h$ ^= percentInForeground;
    h$ *= 1000003;
    h$ ^= percentInPortrait;
    return h$;
  }

  @Override
  public SessionState.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends SessionState.Builder {
    private Integer secondsSinceLastReroute;
    private MetricsRouteProgress eventRouteProgress;
    private Location eventLocation;
    private Date eventDate;
    private Double eventRouteDistanceCompleted;
    private List<Location> afterEventLocations;
    private List<Location> beforeEventLocations;
    private DirectionsRoute originalDirectionRoute;
    private DirectionsRoute currentDirectionRoute;
    private String sessionIdentifier;
    private String tripIdentifier;
    private String originalRequestIdentifier;
    private String requestIdentifier;
    private Boolean mockLocation;
    private Integer rerouteCount;
    private Date startTimestamp;
    private Date arrivalTimestamp;
    private String locationEngineName;
    private Integer percentInForeground;
    private Integer percentInPortrait;
    Builder() {
    }
    private Builder(SessionState source) {
      this.secondsSinceLastReroute = source.secondsSinceLastReroute();
      this.eventRouteProgress = source.eventRouteProgress();
      this.eventLocation = source.eventLocation();
      this.eventDate = source.eventDate();
      this.eventRouteDistanceCompleted = source.eventRouteDistanceCompleted();
      this.afterEventLocations = source.afterEventLocations();
      this.beforeEventLocations = source.beforeEventLocations();
      this.originalDirectionRoute = source.originalDirectionRoute();
      this.currentDirectionRoute = source.currentDirectionRoute();
      this.sessionIdentifier = source.sessionIdentifier();
      this.tripIdentifier = source.tripIdentifier();
      this.originalRequestIdentifier = source.originalRequestIdentifier();
      this.requestIdentifier = source.requestIdentifier();
      this.mockLocation = source.mockLocation();
      this.rerouteCount = source.rerouteCount();
      this.startTimestamp = source.startTimestamp();
      this.arrivalTimestamp = source.arrivalTimestamp();
      this.locationEngineName = source.locationEngineName();
      this.percentInForeground = source.percentInForeground();
      this.percentInPortrait = source.percentInPortrait();
    }
    @Override
    public SessionState.Builder secondsSinceLastReroute(int secondsSinceLastReroute) {
      this.secondsSinceLastReroute = secondsSinceLastReroute;
      return this;
    }
    @Override
    public SessionState.Builder eventRouteProgress(MetricsRouteProgress eventRouteProgress) {
      if (eventRouteProgress == null) {
        throw new NullPointerException("Null eventRouteProgress");
      }
      this.eventRouteProgress = eventRouteProgress;
      return this;
    }
    @Override
    public SessionState.Builder eventLocation(@Nullable Location eventLocation) {
      this.eventLocation = eventLocation;
      return this;
    }
    @Override
    public SessionState.Builder eventDate(@Nullable Date eventDate) {
      this.eventDate = eventDate;
      return this;
    }
    @Override
    public SessionState.Builder eventRouteDistanceCompleted(double eventRouteDistanceCompleted) {
      this.eventRouteDistanceCompleted = eventRouteDistanceCompleted;
      return this;
    }
    @Override
    public SessionState.Builder afterEventLocations(@Nullable List<Location> afterEventLocations) {
      this.afterEventLocations = afterEventLocations;
      return this;
    }
    @Override
    public SessionState.Builder beforeEventLocations(@Nullable List<Location> beforeEventLocations) {
      this.beforeEventLocations = beforeEventLocations;
      return this;
    }
    @Override
    public SessionState.Builder originalDirectionRoute(@Nullable DirectionsRoute originalDirectionRoute) {
      this.originalDirectionRoute = originalDirectionRoute;
      return this;
    }
    @Override
    public SessionState.Builder currentDirectionRoute(@Nullable DirectionsRoute currentDirectionRoute) {
      this.currentDirectionRoute = currentDirectionRoute;
      return this;
    }
    @Override
    public SessionState.Builder sessionIdentifier(String sessionIdentifier) {
      if (sessionIdentifier == null) {
        throw new NullPointerException("Null sessionIdentifier");
      }
      this.sessionIdentifier = sessionIdentifier;
      return this;
    }
    @Override
    public SessionState.Builder tripIdentifier(String tripIdentifier) {
      if (tripIdentifier == null) {
        throw new NullPointerException("Null tripIdentifier");
      }
      this.tripIdentifier = tripIdentifier;
      return this;
    }
    @Override
    public SessionState.Builder originalRequestIdentifier(@Nullable String originalRequestIdentifier) {
      this.originalRequestIdentifier = originalRequestIdentifier;
      return this;
    }
    @Override
    public SessionState.Builder requestIdentifier(@Nullable String requestIdentifier) {
      this.requestIdentifier = requestIdentifier;
      return this;
    }
    @Override
    public SessionState.Builder mockLocation(boolean mockLocation) {
      this.mockLocation = mockLocation;
      return this;
    }
    @Override
    public SessionState.Builder rerouteCount(int rerouteCount) {
      this.rerouteCount = rerouteCount;
      return this;
    }
    @Override
    public SessionState.Builder startTimestamp(@Nullable Date startTimestamp) {
      this.startTimestamp = startTimestamp;
      return this;
    }
    @Override
    public SessionState.Builder arrivalTimestamp(@Nullable Date arrivalTimestamp) {
      this.arrivalTimestamp = arrivalTimestamp;
      return this;
    }
    @Override
    public SessionState.Builder locationEngineName(String locationEngineName) {
      if (locationEngineName == null) {
        throw new NullPointerException("Null locationEngineName");
      }
      this.locationEngineName = locationEngineName;
      return this;
    }
    @Override
    public SessionState.Builder percentInForeground(int percentInForeground) {
      this.percentInForeground = percentInForeground;
      return this;
    }
    @Override
    public SessionState.Builder percentInPortrait(int percentInPortrait) {
      this.percentInPortrait = percentInPortrait;
      return this;
    }
    @Override
    public SessionState build() {
      String missing = "";
      if (this.secondsSinceLastReroute == null) {
        missing += " secondsSinceLastReroute";
      }
      if (this.eventRouteProgress == null) {
        missing += " eventRouteProgress";
      }
      if (this.eventRouteDistanceCompleted == null) {
        missing += " eventRouteDistanceCompleted";
      }
      if (this.sessionIdentifier == null) {
        missing += " sessionIdentifier";
      }
      if (this.tripIdentifier == null) {
        missing += " tripIdentifier";
      }
      if (this.mockLocation == null) {
        missing += " mockLocation";
      }
      if (this.rerouteCount == null) {
        missing += " rerouteCount";
      }
      if (this.locationEngineName == null) {
        missing += " locationEngineName";
      }
      if (this.percentInForeground == null) {
        missing += " percentInForeground";
      }
      if (this.percentInPortrait == null) {
        missing += " percentInPortrait";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SessionState(
          this.secondsSinceLastReroute,
          this.eventRouteProgress,
          this.eventLocation,
          this.eventDate,
          this.eventRouteDistanceCompleted,
          this.afterEventLocations,
          this.beforeEventLocations,
          this.originalDirectionRoute,
          this.currentDirectionRoute,
          this.sessionIdentifier,
          this.tripIdentifier,
          this.originalRequestIdentifier,
          this.requestIdentifier,
          this.mockLocation,
          this.rerouteCount,
          this.startTimestamp,
          this.arrivalTimestamp,
          this.locationEngineName,
          this.percentInForeground,
          this.percentInPortrait);
    }
  }

}