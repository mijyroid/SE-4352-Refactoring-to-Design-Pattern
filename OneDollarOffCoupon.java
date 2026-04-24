public class OneDollarOffCoupon extends Coupon {
    public OneDollarOffCoupon(DiscountPriceStrategy drps) {
        super(drps);
    }

    @Override
    public double getPrice(Rental rental) {
        double p = super.getPrice(rental);
        if (p > 5.0) {
            return p - 1.0;
        }
        return p;
    }
}