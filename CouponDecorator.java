public abstract class CouponDecorator implements PriceStrategy {
    protected PriceStrategy decoratedPriceStrategy;

    public CouponDecorator(PriceStrategy decoratedPriceStrategy) {
        this.decoratedPriceStrategy = decoratedPriceStrategy;
    }

    public double getRentalPrice(Rental rental) {
        return decoratedPriceStrategy.getRentalPrice(rental);
    }
}



