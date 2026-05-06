public class TenExtraPointCoupon extends ExtraPointCoupon {

    public TenExtraPointCoupon(ExtraPointStrategy frpStrategy) {
        super(frpStrategy);
    }

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
