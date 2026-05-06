import java.util.List;

public abstract class TExtraPoint extends TCoupon {

    public TExtraPoint(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    public abstract int getFRP(List<Rental> rentals);
}