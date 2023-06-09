

package com.mapbox.services.android.navigation.v5.routeprogress;

import androidx.annotation.Nullable;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.BannerInstruction;
import com.mapbox.navigator.VoiceInstruction;
import java.util.List;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_RouteProgress extends RouteProgress {

  private final DirectionsRoute directionsRoute;
  private final int legIndex;
  private final double distanceRemaining;
  private final RouteLegProgress currentLegProgress;
  private final List<Point> currentStepPoints;
  private final List<Point> upcomingStepPoints;
  private final boolean inTunnel;
  private final VoiceInstruction voiceInstruction;
  private final BannerInstruction bannerInstruction;
  private final RouteProgressState currentState;
  private final Geometry routeGeometryWithBuffer;
  private final LegStep currentStep;
  private final int stepIndex;
  private final double legDistanceRemaining;
  private final double stepDistanceRemaining;
  private final double legDurationRemaining;

  private AutoValue_RouteProgress(
      DirectionsRoute directionsRoute,
      int legIndex,
      double distanceRemaining,
      RouteLegProgress currentLegProgress,
      List<Point> currentStepPoints,
      @Nullable List<Point> upcomingStepPoints,
      boolean inTunnel,
      @Nullable VoiceInstruction voiceInstruction,
      @Nullable BannerInstruction bannerInstruction,
      @Nullable RouteProgressState currentState,
      @Nullable Geometry routeGeometryWithBuffer,
      LegStep currentStep,
      int stepIndex,
      double legDistanceRemaining,
      double stepDistanceRemaining,
      double legDurationRemaining) {
    this.directionsRoute = directionsRoute;
    this.legIndex = legIndex;
    this.distanceRemaining = distanceRemaining;
    this.currentLegProgress = currentLegProgress;
    this.currentStepPoints = currentStepPoints;
    this.upcomingStepPoints = upcomingStepPoints;
    this.inTunnel = inTunnel;
    this.voiceInstruction = voiceInstruction;
    this.bannerInstruction = bannerInstruction;
    this.currentState = currentState;
    this.routeGeometryWithBuffer = routeGeometryWithBuffer;
    this.currentStep = currentStep;
    this.stepIndex = stepIndex;
    this.legDistanceRemaining = legDistanceRemaining;
    this.stepDistanceRemaining = stepDistanceRemaining;
    this.legDurationRemaining = legDurationRemaining;
  }

  @Override
  public DirectionsRoute directionsRoute() {
    return directionsRoute;
  }

  @Override
  public int legIndex() {
    return legIndex;
  }

  @Override
  public double distanceRemaining() {
    return distanceRemaining;
  }

  @Override
  public RouteLegProgress currentLegProgress() {
    return currentLegProgress;
  }

  @Override
  public List<Point> currentStepPoints() {
    return currentStepPoints;
  }

  @Nullable
  @Override
  public List<Point> upcomingStepPoints() {
    return upcomingStepPoints;
  }

  @Override
  public boolean inTunnel() {
    return inTunnel;
  }

  @Nullable
  @Override
  public VoiceInstruction voiceInstruction() {
    return voiceInstruction;
  }

  @Nullable
  @Override
  public BannerInstruction bannerInstruction() {
    return bannerInstruction;
  }

  @Nullable
  @Override
  public RouteProgressState currentState() {
    return currentState;
  }

  @Nullable
  @Override
  public Geometry routeGeometryWithBuffer() {
    return routeGeometryWithBuffer;
  }

  @Override
  LegStep currentStep() {
    return currentStep;
  }

  @Override
  int stepIndex() {
    return stepIndex;
  }

  @Override
  double legDistanceRemaining() {
    return legDistanceRemaining;
  }

  @Override
  double stepDistanceRemaining() {
    return stepDistanceRemaining;
  }

  @Override
  double legDurationRemaining() {
    return legDurationRemaining;
  }

  @Override
  public String toString() {
    return "RouteProgress{"
         + "directionsRoute=" + directionsRoute + ", "
         + "legIndex=" + legIndex + ", "
         + "distanceRemaining=" + distanceRemaining + ", "
         + "currentLegProgress=" + currentLegProgress + ", "
         + "currentStepPoints=" + currentStepPoints + ", "
         + "upcomingStepPoints=" + upcomingStepPoints + ", "
         + "inTunnel=" + inTunnel + ", "
         + "voiceInstruction=" + voiceInstruction + ", "
         + "bannerInstruction=" + bannerInstruction + ", "
         + "currentState=" + currentState + ", "
         + "routeGeometryWithBuffer=" + routeGeometryWithBuffer + ", "
         + "currentStep=" + currentStep + ", "
         + "stepIndex=" + stepIndex + ", "
         + "legDistanceRemaining=" + legDistanceRemaining + ", "
         + "stepDistanceRemaining=" + stepDistanceRemaining + ", "
         + "legDurationRemaining=" + legDurationRemaining
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouteProgress) {
      RouteProgress that = (RouteProgress) o;
      return (this.directionsRoute.equals(that.directionsRoute()))
           && (this.legIndex == that.legIndex())
           && (Double.doubleToLongBits(this.distanceRemaining) == Double.doubleToLongBits(that.distanceRemaining()))
           && (this.currentLegProgress.equals(that.currentLegProgress()))
           && (this.currentStepPoints.equals(that.currentStepPoints()))
           && ((this.upcomingStepPoints == null) ? (that.upcomingStepPoints() == null) : this.upcomingStepPoints.equals(that.upcomingStepPoints()))
           && (this.inTunnel == that.inTunnel())
           && ((this.voiceInstruction == null) ? (that.voiceInstruction() == null) : this.voiceInstruction.equals(that.voiceInstruction()))
           && ((this.bannerInstruction == null) ? (that.bannerInstruction() == null) : this.bannerInstruction.equals(that.bannerInstruction()))
           && ((this.currentState == null) ? (that.currentState() == null) : this.currentState.equals(that.currentState()))
           && ((this.routeGeometryWithBuffer == null) ? (that.routeGeometryWithBuffer() == null) : this.routeGeometryWithBuffer.equals(that.routeGeometryWithBuffer()))
           && (this.currentStep.equals(that.currentStep()))
           && (this.stepIndex == that.stepIndex())
           && (Double.doubleToLongBits(this.legDistanceRemaining) == Double.doubleToLongBits(that.legDistanceRemaining()))
           && (Double.doubleToLongBits(this.stepDistanceRemaining) == Double.doubleToLongBits(that.stepDistanceRemaining()))
           && (Double.doubleToLongBits(this.legDurationRemaining) == Double.doubleToLongBits(that.legDurationRemaining()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= directionsRoute.hashCode();
    h$ *= 1000003;
    h$ ^= legIndex;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(distanceRemaining) >>> 32) ^ Double.doubleToLongBits(distanceRemaining));
    h$ *= 1000003;
    h$ ^= currentLegProgress.hashCode();
    h$ *= 1000003;
    h$ ^= currentStepPoints.hashCode();
    h$ *= 1000003;
    h$ ^= (upcomingStepPoints == null) ? 0 : upcomingStepPoints.hashCode();
    h$ *= 1000003;
    h$ ^= inTunnel ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (voiceInstruction == null) ? 0 : voiceInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= (bannerInstruction == null) ? 0 : bannerInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= (currentState == null) ? 0 : currentState.hashCode();
    h$ *= 1000003;
    h$ ^= (routeGeometryWithBuffer == null) ? 0 : routeGeometryWithBuffer.hashCode();
    h$ *= 1000003;
    h$ ^= currentStep.hashCode();
    h$ *= 1000003;
    h$ ^= stepIndex;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(legDistanceRemaining) >>> 32) ^ Double.doubleToLongBits(legDistanceRemaining));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(stepDistanceRemaining) >>> 32) ^ Double.doubleToLongBits(stepDistanceRemaining));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(legDurationRemaining) >>> 32) ^ Double.doubleToLongBits(legDurationRemaining));
    return h$;
  }

  @Override
  public RouteProgress.Builder toBuilder() {
    return new Builder(this);
  }

  static final class Builder extends RouteProgress.Builder {
    private DirectionsRoute directionsRoute;
    private Integer legIndex;
    private Double distanceRemaining;
    private RouteLegProgress currentLegProgress;
    private List<Point> currentStepPoints;
    private List<Point> upcomingStepPoints;
    private Boolean inTunnel;
    private VoiceInstruction voiceInstruction;
    private BannerInstruction bannerInstruction;
    private RouteProgressState currentState;
    private Geometry routeGeometryWithBuffer;
    private LegStep currentStep;
    private Integer stepIndex;
    private Double legDistanceRemaining;
    private Double stepDistanceRemaining;
    private Double legDurationRemaining;
    Builder() {
    }
    private Builder(RouteProgress source) {
      this.directionsRoute = source.directionsRoute();
      this.legIndex = source.legIndex();
      this.distanceRemaining = source.distanceRemaining();
      this.currentLegProgress = source.currentLegProgress();
      this.currentStepPoints = source.currentStepPoints();
      this.upcomingStepPoints = source.upcomingStepPoints();
      this.inTunnel = source.inTunnel();
      this.voiceInstruction = source.voiceInstruction();
      this.bannerInstruction = source.bannerInstruction();
      this.currentState = source.currentState();
      this.routeGeometryWithBuffer = source.routeGeometryWithBuffer();
      this.currentStep = source.currentStep();
      this.stepIndex = source.stepIndex();
      this.legDistanceRemaining = source.legDistanceRemaining();
      this.stepDistanceRemaining = source.stepDistanceRemaining();
      this.legDurationRemaining = source.legDurationRemaining();
    }
    @Override
    public RouteProgress.Builder directionsRoute(DirectionsRoute directionsRoute) {
      if (directionsRoute == null) {
        throw new NullPointerException("Null directionsRoute");
      }
      this.directionsRoute = directionsRoute;
      return this;
    }
    @Override
    DirectionsRoute directionsRoute() {
      if (directionsRoute == null) {
        throw new IllegalStateException("Property \"directionsRoute\" has not been set");
      }
      return directionsRoute;
    }
    @Override
    public RouteProgress.Builder legIndex(int legIndex) {
      this.legIndex = legIndex;
      return this;
    }
    @Override
    int legIndex() {
      if (legIndex == null) {
        throw new IllegalStateException("Property \"legIndex\" has not been set");
      }
      return legIndex;
    }
    @Override
    public RouteProgress.Builder distanceRemaining(double distanceRemaining) {
      this.distanceRemaining = distanceRemaining;
      return this;
    }
    @Override
    RouteProgress.Builder currentLegProgress(RouteLegProgress currentLegProgress) {
      if (currentLegProgress == null) {
        throw new NullPointerException("Null currentLegProgress");
      }
      this.currentLegProgress = currentLegProgress;
      return this;
    }
    @Override
    public RouteProgress.Builder currentStepPoints(List<Point> currentStepPoints) {
      if (currentStepPoints == null) {
        throw new NullPointerException("Null currentStepPoints");
      }
      this.currentStepPoints = currentStepPoints;
      return this;
    }
    @Override
    List<Point> currentStepPoints() {
      if (currentStepPoints == null) {
        throw new IllegalStateException("Property \"currentStepPoints\" has not been set");
      }
      return currentStepPoints;
    }
    @Override
    public RouteProgress.Builder upcomingStepPoints(@Nullable List<Point> upcomingStepPoints) {
      this.upcomingStepPoints = upcomingStepPoints;
      return this;
    }
    @Override
    @Nullable List<Point> upcomingStepPoints() {
      return upcomingStepPoints;
    }
    @Override
    public RouteProgress.Builder inTunnel(boolean inTunnel) {
      this.inTunnel = inTunnel;
      return this;
    }
    @Override
    public RouteProgress.Builder voiceInstruction(@Nullable VoiceInstruction voiceInstruction) {
      this.voiceInstruction = voiceInstruction;
      return this;
    }
    @Override
    public RouteProgress.Builder bannerInstruction(@Nullable BannerInstruction bannerInstruction) {
      this.bannerInstruction = bannerInstruction;
      return this;
    }
    @Override
    public RouteProgress.Builder currentState(@Nullable RouteProgressState currentState) {
      this.currentState = currentState;
      return this;
    }
    @Override
    public RouteProgress.Builder routeGeometryWithBuffer(@Nullable Geometry routeGeometryWithBuffer) {
      this.routeGeometryWithBuffer = routeGeometryWithBuffer;
      return this;
    }
    @Override
    public RouteProgress.Builder currentStep(LegStep currentStep) {
      if (currentStep == null) {
        throw new NullPointerException("Null currentStep");
      }
      this.currentStep = currentStep;
      return this;
    }
    @Override
    LegStep currentStep() {
      if (currentStep == null) {
        throw new IllegalStateException("Property \"currentStep\" has not been set");
      }
      return currentStep;
    }
    @Override
    public RouteProgress.Builder stepIndex(int stepIndex) {
      this.stepIndex = stepIndex;
      return this;
    }
    @Override
    int stepIndex() {
      if (stepIndex == null) {
        throw new IllegalStateException("Property \"stepIndex\" has not been set");
      }
      return stepIndex;
    }
    @Override
    public RouteProgress.Builder legDistanceRemaining(double legDistanceRemaining) {
      this.legDistanceRemaining = legDistanceRemaining;
      return this;
    }
    @Override
    double legDistanceRemaining() {
      if (legDistanceRemaining == null) {
        throw new IllegalStateException("Property \"legDistanceRemaining\" has not been set");
      }
      return legDistanceRemaining;
    }
    @Override
    public RouteProgress.Builder stepDistanceRemaining(double stepDistanceRemaining) {
      this.stepDistanceRemaining = stepDistanceRemaining;
      return this;
    }
    @Override
    double stepDistanceRemaining() {
      if (stepDistanceRemaining == null) {
        throw new IllegalStateException("Property \"stepDistanceRemaining\" has not been set");
      }
      return stepDistanceRemaining;
    }
    @Override
    public RouteProgress.Builder legDurationRemaining(double legDurationRemaining) {
      this.legDurationRemaining = legDurationRemaining;
      return this;
    }
    @Override
    double legDurationRemaining() {
      if (legDurationRemaining == null) {
        throw new IllegalStateException("Property \"legDurationRemaining\" has not been set");
      }
      return legDurationRemaining;
    }
    @Override
    RouteProgress autoBuild() {
      String missing = "";
      if (this.directionsRoute == null) {
        missing += " directionsRoute";
      }
      if (this.legIndex == null) {
        missing += " legIndex";
      }
      if (this.distanceRemaining == null) {
        missing += " distanceRemaining";
      }
      if (this.currentLegProgress == null) {
        missing += " currentLegProgress";
      }
      if (this.currentStepPoints == null) {
        missing += " currentStepPoints";
      }
      if (this.inTunnel == null) {
        missing += " inTunnel";
      }
      if (this.currentStep == null) {
        missing += " currentStep";
      }
      if (this.stepIndex == null) {
        missing += " stepIndex";
      }
      if (this.legDistanceRemaining == null) {
        missing += " legDistanceRemaining";
      }
      if (this.stepDistanceRemaining == null) {
        missing += " stepDistanceRemaining";
      }
      if (this.legDurationRemaining == null) {
        missing += " legDurationRemaining";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_RouteProgress(
          this.directionsRoute,
          this.legIndex,
          this.distanceRemaining,
          this.currentLegProgress,
          this.currentStepPoints,
          this.upcomingStepPoints,
          this.inTunnel,
          this.voiceInstruction,
          this.bannerInstruction,
          this.currentState,
          this.routeGeometryWithBuffer,
          this.currentStep,
          this.stepIndex,
          this.legDistanceRemaining,
          this.stepDistanceRemaining,
          this.legDurationRemaining);
    }
  }

}
