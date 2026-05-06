public abstract class ExtraPointCoupon extends ExtraPointStrategy {

    protected ExtraPointStrategy wrappedFRP;

    public ExtraPointCoupon(ExtraPointStrategy frpStrategy) {
        this.wrappedFRP = frpStrategy;
    }

    @Override
    public int getFRP(Rental rental) {
        return wrappedFRP.getFRP(rental);
    }
}
