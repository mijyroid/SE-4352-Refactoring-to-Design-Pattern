import java.util.List;

public class TwentyExtraPointCoupon extends TExtraPointCoupon {

    public TwentyExtraPointCoupon(TExtraPoint strategy) {
        super(strategy);
    }

    @Override
    public int getFRP(List<Rental> rentals) {
        int points = ((TExtraPoint)wrappedStrategy).getFRP(rentals);
        
        if (rentals.size() >= 4) {                 
            points += 20;
        }
        return points;
    }
}