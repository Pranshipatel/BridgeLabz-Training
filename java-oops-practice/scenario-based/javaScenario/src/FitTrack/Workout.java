package FitTrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    abstract int calculateCalories();

    public void startWorkout() {
        System.out.println("\nWorkout Started: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }

    public void stopWorkout() {
        caloriesBurned = calculateCalories();
        System.out.println("Workout Finished!");
        System.out.println("Calories Burned: " + caloriesBurned + " kcal");
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
