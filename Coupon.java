// Coupon class that extends DiscountPriceStrategy 
// and serves as a base for specific coupon types
public abstract class Coupon extends DiscountPriceStrategy {
    protected DiscountPriceStrategy drps;

    public Coupon(DiscountPriceStrategy drps) {
        this.drps = drps;
    }

    // Subclasses: %OffCoupon, $$OffCoupon
    @Override
    public double getPrice(Rental rental) {
        return drps.getPrice(rental);
    }

    // Default implementation for free rentals
    @Override
    public double getFree() {
        return super.getFree();
    }
}
