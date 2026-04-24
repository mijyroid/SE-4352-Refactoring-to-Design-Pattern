/*FiftyPercentOffCoupon class that applies a 50% discount 
to the price calculated by the wrapped DiscountPriceStrategy*/
public class FiftyPercentOffCoupon extends Coupon {
    public FiftyPercentOffCoupon(DiscountPriceStrategy drps) {
        super(drps);
    }

    // Override getPrice to apply a 50% discount
    @Override
    public double getPrice(Rental rental) {
        double p = super.getPrice(rental);
        return p * 0.5;
    }
}

