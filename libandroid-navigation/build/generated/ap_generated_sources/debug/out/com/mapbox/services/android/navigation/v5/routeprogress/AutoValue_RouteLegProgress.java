

package com.mapbox.services.android.navigation.v5.routeprogress;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.geojson.Point;
import java.util.List;

// Generated by com.google.auto.value.processor.AutoValueProcessor
 final class AutoValue_RouteLegProgress extends RouteLegProgress {

  private final int stepIndex;
  private final double distanceRemaining;
  private final double durationRemaining;
  private final LegStep currentStep;
  private final RouteStepProgress currentStepProgress;
  private final List<Point> currentStepPoints;
  private final List<Point> upcomingStepPoints;
  private final RouteLeg routeLeg;
  private final double stepDistanceRemaining;

  private AutoValue_RouteLegProgress(
      int stepIndex,
      double distanceRemaining,
      double durationRemaining,
      LegStep currentStep,
      RouteStepProgress currentStepProgress,
      List<Point> currentStepPoints,
      @Nullable List<Point> upcomingStepPoints,
      RouteLeg routeLeg,
      double stepDistanceRemaining) {
    this.stepIndex = stepIndex;
    this.distanceRemaining = distanceRemaining;
    this.durationRemaining = durationRemaining;
    this.currentStep = currentStep;
    this.currentStepProgress = currentStepProgress;
    this.currentStepPoints = currentStepPoints;
    this.upcomingStepPoints = upcomingStepPoints;
    this.routeLeg = routeLeg;
    this.stepDistanceRemaining = stepDistanceRemaining;
  }

  @Override
  public int stepIndex() {
    return stepIndex;
  }

  @Override
  public double distanceRemaining() {
    return distanceRemaining;
  }

  @Override
  public double durationRemaining() {
    return durationRemaining;
  }

  @NonNull
  @Override
  public LegStep currentStep() {
    return currentStep;
  }

  @Override
  public RouteStepProgress currentStepProgress() {
    return currentStepProgress;
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
  RouteLeg routeLeg() {
    return routeLeg;
  }

  @Override
  double stepDistanceRemaining() {
    return stepDistanceRemaining;
  }

  @Override
  public String toString() {
    return "RouteLegProgress{"
         + "stepIndex=" + stepIndex + ", "
         + "distanceRemaining=" + distanceRemaining + ", "
         + "durationRemaining=" + durationRemaining + ", "
         + "currentStep=" + currentStep + ", "
         + "currentStepProgress=" + currentStepProgress + ", "
         + "currentStepPoints=" + currentStepPoints + ", "
         + "upcomingStepPoints=" + upcomingStepPoints + ", "
         + "routeLeg=" + routeLeg + ", "
         + "stepDistanceRemaining=" + stepDistanceRemaining
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RouteLegProgress) {
      RouteLegProgress that = (RouteLegProgress) o;
      return (this.stepIndex == that.stepIndex())
           && (Double.doubleToLongBits(this.distanceRemaining) == Double.doubleToLongBits(that.distanceRemaining()))
           && (Double.doubleToLongBits(this.durationRemaining) == Double.doubleToLongBits(that.durationRemaining()))
           && (this.currentStep.equals(that.currentStep()))
           && (this.currentStepProgress.equals(that.currentStepProgress()))
           && (this.currentStepPoints.equals(that.currentStepPoints()))
           && ((this.upcomingStepPoints == null) ? (that.upcomingStepPoints() == null) : this.upcomingStepPoints.equals(that.upcomingStepPoints()))
           && (this.routeLeg.equals(that.routeLeg()))
           && (Double.doubleToLongBits(this.stepDistanceRemaining) == Double.doubleToLongBits(that.stepDistanceRemaining()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= stepIndex;
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(distanceRemaining) >>> 32) ^ Double.doubleToLongBits(distanceRemaining));
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(durationRemaining) >>> 32) ^ Double.doubleToLongBits(durationRemaining));
    h$ *= 1000003;
    h$ ^= currentStep.hashCode();
    h$ *= 1000003;
    h$ ^= currentStepProgress.hashCode();
    h$ *= 1000003;
    h$ ^= currentStepPoints.hashCode();
    h$ *= 1000003;
    h$ ^= (upcomingStepPoints == null) ? 0 : upcomingStepPoints.hashCode();
    h$ *= 1000003;
    h$ ^= routeLeg.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((Double.doubleToLongBits(stepDistanceRemaining) >>> 32) ^ Double.doubleToLongBits(stepDistanceRemaining));
    return h$;
  }

  static final class Builder extends RouteLegProgress.Builder {
    private Integer stepIndex;
    private Double distanceRemaining;
    private Double durationRemaining;
    private LegStep currentStep;
    private RouteStepProgress currentStepProgress;
    private List<Point> currentStepPoints;
    private List<Point> upcomingStepPoints;
    private RouteLeg routeLeg;
    private Double stepDistanceRemaining;
    Builder() {
    }
    @Override
    RouteLegProgress.Builder stepIndex(int stepIndex) {
      this.stepIndex = stepIndex;
      return this;
    }
    @Override
    RouteLegProgress.Builder distanceRemaining(double distanceRemaining) {
      this.distanceRemaining = distanceRemaining;
      return this;
    }
    @Override
    RouteLegProgress.Builder durationRemaining(double durationRemaining) {
      this.durationRemaining = durationRemaining;
      return this;
    }
    @Override
    RouteLegProgress.Builder currentStep(LegStep currentStep) {
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
    RouteLegProgress.Builder currentStepProgress(RouteStepProgress currentStepProgress) {
      if (currentStepProgress == null) {
        throw new NullPointerException("Null currentStepProgress");
      }
      this.currentStepProgress = currentStepProgress;
      return this;
    }
    @Override
    RouteLegProgress.Builder currentStepPoints(List<Point> currentStepPoints) {
      if (currentStepPoints == null) {
        throw new NullPointerException("Null currentStepPoints");
      }
      this.currentStepPoints = currentStepPoints;
      return this;
    }
    @Override
    RouteLegProgress.Builder upcomingStepPoints(@Nullable List<Point> upcomingStepPoints) {
      this.upcomingStepPoints = upcomingStepPoints;
      return this;
    }
    @Override
    RouteLegProgress.Builder routeLeg(RouteLeg routeLeg) {
      if (routeLeg == null) {
        throw new NullPointerException("Null routeLeg");
      }
      this.routeLeg = routeLeg;
      return this;
    }
    @Override
    RouteLegProgress.Builder stepDistanceRemaining(double stepDistanceRemaining) {
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
    RouteLegProgress autoBuild() {
      String missing = "";
      if (this.stepIndex == null) {
        missing += " stepIndex";
      }
      if (this.distanceRemaining == null) {
        missing += " distanceRemaining";
      }
      if (this.durationRemaining == null) {
        missing += " durationRemaining";
      }
      if (this.currentStep == null) {
        missing += " currentStep";
      }
      if (this.currentStepProgress == null) {
        missing += " currentStepProgress";
      }
      if (this.currentStepPoints == null) {
        missing += " currentStepPoints";
      }
      if (this.routeLeg == null) {
        missing += " routeLeg";
      }
      if (this.stepDistanceRemaining == null) {
        missing += " stepDistanceRemaining";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_RouteLegProgress(
          this.stepIndex,
          this.distanceRemaining,
          this.durationRemaining,
          this.currentStep,
          this.currentStepProgress,
          this.currentStepPoints,
          this.upcomingStepPoints,
          this.routeLeg,
          this.stepDistanceRemaining);
    }
  }

}
