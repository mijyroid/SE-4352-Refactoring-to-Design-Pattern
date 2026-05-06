import java.util.List;

public abstract class TExtraPointCoupon extends TExtraPoint {

    public TExtraPointCoupon(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    @Override
    public abstract int getFRP(List<Rental> rentals);
}
