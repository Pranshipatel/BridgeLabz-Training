package traincompanion;

public class TrainRoute {

    Compartment head;
    Compartment tail;

    // Insert at end
    void addCompartment(String name, String service) {
        Compartment newNode = new Compartment(name, service);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Traverse forward
    void traverseForward() {
        Compartment temp = head;
        System.out.println("Forward Traversal:");
        while (temp != null) {
            System.out.println(temp.name + " - " + temp.service);
            temp = temp.next;
        }
    }

    // Traverse backward
    void traverseBackward() {
        Compartment temp = tail;
        System.out.println("Backward Traversal:");
        while (temp != null) {
            System.out.println(temp.name + " - " + temp.service);
            temp = temp.prev;
        }
    }

    // Remove compartment by name
    void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println("Removed: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }

    // Search by service
    void searchService(String service) {
        Compartment temp = head;
        System.out.println("Searching for service: " + service);

        while (temp != null) {
            if (temp.service.equalsIgnoreCase(service)) {
                System.out.println("Found in: " + temp.name);
            }
            temp = temp.next;
        }
    }

    // Display adjacent compartments
    void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Current: " + temp.name);

                if (temp.prev != null)
                    System.out.println("Previous: " + temp.prev.name);
                else
                    System.out.println("Previous: None");

                if (temp.next != null)
                    System.out.println("Next: " + temp.next.name);
                else
                    System.out.println("Next: None");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found");
    }
}