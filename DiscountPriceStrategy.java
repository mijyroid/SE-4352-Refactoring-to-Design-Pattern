public abstract class DiscountPriceStrategy {
    public abstract double getPrice(Rental rental);

    public double getFree() {
        return 0.0;
    }
}
