// Requirement (b): A coupon for $1 off the rental price
public class OneDollarOffCoupon extends CouponDecorator {
    private static final double MIN_PRICE = 5.0;
    private static final double DISCOUNT  = 1.0;

    public OneDollarOffCoupon(PriceStrategy decoratedPriceStrategy) {
        super(decoratedPriceStrategy);
    }

    @Override
    public double getRentalPrice(Rental rental) {
        double basePrice = super.getRentalPrice(rental);

        // If price is > $5, subtract $1; otherwise, return original price
        if (basePrice > MIN_PRICE) {
            return basePrice - DISCOUNT;
        }
        return basePrice; // coupon doesn't apply
    }
}
