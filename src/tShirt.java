public abstract class tShirt implements Sport_shop {

    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public abstract float price();
}
