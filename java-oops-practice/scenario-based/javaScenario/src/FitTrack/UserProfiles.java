package FitTrack;

class UserProfile {
    private String name;
    private int age;
    private double weight;   
    private String goal;

    // Default goal
    public UserProfile(String name, int age, double weight) {
        this(name, age, weight, "Stay Fit");
    }

    // Custom goal
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    public double getWeight() {
        return weight;   
    }

    public void showProfile() {
        System.out.println("\n USER PROFILE");
        System.out.println("---------------------------");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Goal  : " + goal);
        System.out.println("---------------------------");
    }
}
