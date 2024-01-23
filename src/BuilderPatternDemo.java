public class BuilderPatternDemo {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Booking vegBooking = orderBuilder.prepareOrder1();
        System.out.println("Veg Meal");
        vegBooking.showItems();
        System.out.println("Total Cost: " + vegBooking.getCost());

        Booking nonVegBooking = orderBuilder.prepareOrder2();
        System.out.println("\nNon-Veg Meal");
        nonVegBooking.showItems();
        System.out.println("Total Cost: " + nonVegBooking.getCost());
    }
}
