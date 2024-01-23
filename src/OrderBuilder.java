public class OrderBuilder {

    public Booking prepareOrder1() {
        Booking booking = new Booking();
        booking.addItem(new WhiteCap());
        booking.addItem(new RedTshirt());
        return booking;
    }

    public Booking prepareOrder2() {
        Booking booking = new Booking();
        booking.addItem(new BlackCap());
        booking.addItem(new BlueTshirt());
        return booking;
    }
}
