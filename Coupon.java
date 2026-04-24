public abstract class Coupon extends DiscountPriceStrategy {
    protected DiscountPriceStrategy drps;

    public Coupon(DiscountPriceStrategy drps) {
        this.drps = drps;
    }

    @Override
    public double getPrice(Rental rental) {
        return drps.getPrice(rental);
    }

    @Override
    public double getFree() {
        return super.getFree();
    }
}
