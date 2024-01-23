import java.util.ArrayList;
import java.util.List;

public class Booking {

    List<Sport_shop> sportshops = new ArrayList<>();

    public void addItem(Sport_shop sportshop) {
        sportshops.add(sportshop);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Sport_shop sportshop : sportshops) {
            cost += sportshop.price();
        }
        return cost;
    }

    public void showItems() {
        for (Sport_shop sportshop : sportshops) {
            System.out.print("Item : " + sportshop.name());
            System.out.print(", Manufacturer : " + sportshop.manufacturer());
            System.out.print(", Packing : " + sportshop.packing().pack());
            System.out.println(", Price : " + sportshop.price());
        }
    }
}
