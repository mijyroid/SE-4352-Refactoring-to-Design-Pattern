public abstract class TCoupon extends DiscountTransactionStrategy {
    protected DiscountTransactionStrategy wrappedStrategy;

    public TCoupon(DiscountTransactionStrategy strategy) {
        this.wrappedStrategy = strategy;
    }

    @Override
    public double getPrice(List<Rental> rentals) {
        return wrappedStrategy.getPrice(rentals);
    }
}
