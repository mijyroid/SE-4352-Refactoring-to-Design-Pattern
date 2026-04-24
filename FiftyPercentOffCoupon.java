public class FiftyPercentOffCoupon extends Coupon {
    public FiftyPercentOffCoupon(DiscountPriceStrategy drps) {
        super(drps);
    }

    @Override
    public double getPrice(Rental rental) {
        double p = super.getPrice(rental);
        return p * 0.5;
    }
}

