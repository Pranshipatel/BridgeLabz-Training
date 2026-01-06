package FitTrack;

public class FitTrackApp {
    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Pranshi",
                22,
                55,
                "Lose Fat & Build Strength 💥"
        );

        user.showProfile();

        Workout cardio = new CardioWorkout(30);
        cardio.startWorkout();
        cardio.stopWorkout();

        Workout strength = new StrengthWorkout(40);
        strength.startWorkout();
        strength.stopWorkout();

        int dailyTarget = 500;
        int totalBurned = cardio.getCaloriesBurned() + strength.getCaloriesBurned();

        System.out.println("\nDAILY FITNESS SUMMARY");
        System.out.println("--------------------------------");
        System.out.println("Daily Calorie Target : " + dailyTarget + " kcal");
        System.out.println("Total Burned Today   : " + totalBurned + " kcal");
        System.out.println("Remaining Calories   : " + (dailyTarget - totalBurned) + " kcal");
        System.out.println("--------------------------------");

        
        if (totalBurned >= dailyTarget) {
            System.out.println("GOAL ACHIEVED! Amazing work today!");
        } else {
            System.out.println("Almost there! Keep pushing!");
        }
    }
}
