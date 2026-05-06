import java.util.List;

public class Transaction extends TExtraPoint {

    public Transaction(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    @Override
    public int getFRP(List<Rental> rentals) {
        int points = 0;
        for (Rental r : rentals) {
            points += r.getFRP();
        }
        return points;
    }
}
