// Requirement (a): A coupon for 50% off the rental price
public class FiftyPercentOffCoupon extends CouponDecorator {
    public FiftyPercentOffCoupon(PriceStrategy decoratedPriceStrategy) {
        super(decoratedPriceStrategy);
    }

    @Override
    public double getRentalPrice(Rental rental) {
        return super.getRentalPrice(rental) * 0.5; // Apply 50% discount
    }
}
