// Concrete Decorator class for a $10 Extra Point Coupon
public class TenExtraPointCoupon extends ExtraPointCoupon {

    public TenExtraPointCoupon(ExtraPointStrategy frpStrategy) {
        super(frpStrategy);
    }

    // Overrides the getFRP method to add 10 extra points if the rental price is $10 or more
    @Override
    public int getFRP(Rental rental) {
        int points = super.getFRP(rental);
        double p = rental.getRentPrice();
        if (p >= 10) {
            return points + 10;
        }
        return points;
    }
}
