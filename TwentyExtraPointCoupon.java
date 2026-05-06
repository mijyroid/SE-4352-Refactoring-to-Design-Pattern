import java.util.List;

public class TwentyExtraPointCoupon extends TExtraPointCoupon {

    public TwentyExtraPointCoupon(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    @Override
    public int getFRP(List<Rental> rentals) {
        int points = 0;
        for (Rental r : rentals) {
            points += r.getFRP();                  // super.getFRP()
        }
        if (rentals.size() >= 4) {                 // t.length >= 4
            points += 20;
        }
        return points;
    }
}