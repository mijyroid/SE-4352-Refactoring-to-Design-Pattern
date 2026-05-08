// Abstract Decorator class for Extra Point Coupons
public abstract class ExtraPointCoupon extends ExtraPointStrategy {

    protected ExtraPointStrategy wrappedFRP;

    // Constructor that takes an ExtraPointStrategy to wrap
    public ExtraPointCoupon(ExtraPointStrategy frpStrategy) {
        this.wrappedFRP = frpStrategy;
    }

    // Delegates the getFRP call to the wrapped FRP strategy
    @Override
    public int getFRP(Rental rental) {
        return wrappedFRP.getFRP(rental);
    }
}
