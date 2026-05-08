import java.util.List;

// Abstract Decorator class for Extra Point Coupons
public abstract class TExtraPointCoupon extends TExtraPoint {

    public TExtraPointCoupon(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    @Override
    public abstract int getFRP(List<Rental> rentals);
}
