import java.util.List;

public class Transaction extends TExtraPoint {

    // Constructor that takes a DiscountTransactionStrategy and passes it to the superclass
    public Transaction(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    // Overrides the getFRP method to calculate the total FRP points for a list of rentals
    @Override
    public int getFRP(List<Rental> rentals) {
        int points = 0;
        for (Rental r : rentals) {
            points += r.getFRP();
        }
        return points;
    }
}
