public abstract class CouponDecorator extends DiscountedRentalPrice {
    protected DiscountedRentalPrice drps; // The wrapped strategy or coupon

    public CouponDecorator(DiscountedRentalPrice drps) {
        this.drps = drps;
    }

    // Helper method to get the price from the wrapped object
    public double getBasePrice(Rental rental) {
        return drps.getRentalPrice(rental);
    }
}
