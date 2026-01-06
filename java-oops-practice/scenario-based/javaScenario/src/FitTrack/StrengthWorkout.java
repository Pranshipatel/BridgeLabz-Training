package FitTrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength ", duration);
    }

    @Override
    int calculateCalories() {
        return duration * 5;
    }
}
