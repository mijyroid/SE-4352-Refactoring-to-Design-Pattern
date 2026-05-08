import java.util.List;

// Abstract Decorator class for Extra Point Coupons
public abstract class TExtraPoint extends TCoupon {

    public TExtraPoint(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    public abstract int getFRP(List<Rental> rentals);
}