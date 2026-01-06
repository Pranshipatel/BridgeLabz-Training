package FitTrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio ", duration);
    }

    @Override
    int calculateCalories() {
        return duration * 8;
    }
}
