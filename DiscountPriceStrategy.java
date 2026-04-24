// Abstract class for discount price strategy
public abstract class DiscountPriceStrategy {
    public abstract double getPrice(Rental rental);

    // Default implementation for free rentals
    public double getFree() {
        return 0.0;
    }
}
