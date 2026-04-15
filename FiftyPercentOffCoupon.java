// This class represents a coupon that applies a 50% discount to the rental price
public class FiftyPercentOffCoupon extends CouponDecorator {
    public FiftyPercentOffCoupon(DiscountedRentalPrice drps) {
        super(drps);
    }

    @Override
    public double getRentalPrice(Rental rental) {
        
        // Get the base price from the wrapped DiscountedRentalPrice object and apply a 50% discount
        return getBasePrice(rental) * 0.5; 
    }
}

