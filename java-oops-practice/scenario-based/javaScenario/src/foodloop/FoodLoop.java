package foodloop;
import java.util.ArrayList;
import java.util.List;


public class FoodLoop {
	public static void main(String[] args) {

        FoodItem burger = new VegItem("Veg Burger", 150, 5);
        FoodItem pizza = new VegItem("Cheese Pizza", 300, 3);
        FoodItem chicken = new NonVegItem("Chicken Wings", 400, 2);

        List<FoodItem> comboMeal = new ArrayList<>();
        comboMeal.add(burger);
        comboMeal.add(pizza);
        comboMeal.add(chicken);

        Order order = new Order(comboMeal);
        order.placeOrder();
    }

}
