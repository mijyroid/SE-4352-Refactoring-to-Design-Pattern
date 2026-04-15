// A coupon for $1 off the rental price
public class OneDollarOffCoupon extends CouponDecorator {
    private static final double MIN_PRICE = 5.0;
    private static final double DISCOUNT  = 1.0;

    public OneDollarOffCoupon(DiscountedRentalPrice drps) {
        super(drps);
    }

    @Override
    public double getRentalPrice(Rental rental) {
        double price = getBasePrice(rental);
        
        // Only apply the $1 discount if the price is above the minimum threshold
        if (price > MIN_PRICE) {
            return price - DISCOUNT;
        }
        return price;
    }
}

