public class BuilderPatternDemo {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();

        Booking vegBooking = orderBuilder.prepareOrder1();
        System.out.println("Order 1");
        vegBooking.showItems();
        System.out.println("Total Cost: " + vegBooking.getCost());

        Booking nonVegBooking = orderBuilder.prepareOrder2();
        System.out.println("\nOrder 2");
        nonVegBooking.showItems();
        System.out.println("Total Cost: " + nonVegBooking.getCost());
    }
}
