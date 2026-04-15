public class FiftyPercentOffCoupon extends CouponDecorator {
    public FiftyPercentOffCoupon(DiscountedRentalPrice drps) {
        super(drps);
    }

    @Override
    public double getRentalPrice(Rental rental) {
        // Apply 50% discount to whatever the inner strategy returns
        return getBasePrice(rental) * 0.5; 
    }
}

