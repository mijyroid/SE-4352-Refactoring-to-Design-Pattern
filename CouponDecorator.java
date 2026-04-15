public abstract class CouponDecorator extends DiscountedRentalPrice {
    protected DiscountedRentalPrice drps; // The wrapped DiscountedRentalPrice object

    public CouponDecorator(DiscountedRentalPrice drps) {
        this.drps = drps; // Initialize the wrapped object
    }

    // Method to get the base price from the wrapped DiscountedRentalPrice object
    public double getBasePrice(Rental rental) {
        return drps.getRentalPrice(rental);
    }
}
