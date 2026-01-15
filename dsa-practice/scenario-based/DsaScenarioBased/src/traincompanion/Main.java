package traincompanion;

public class Main {
    public static void main(String[] args) {

        TrainRoute route = new TrainRoute();

        route.addCompartment("C1", "General");
        route.addCompartment("C2", "WiFi");
        route.addCompartment("C3", "Pantry");
        route.addCompartment("C4", "Sleeper");

        route.traverseForward();
        System.out.println();

        route.traverseBackward();
        System.out.println();

        route.searchService("Pantry");
        System.out.println();

        route.showAdjacent("C3");
        System.out.println();

        route.removeCompartment("C2");
        route.traverseForward();
    }
}