import java.util.List;

public class TwentyExtraPointCoupon extends TExtraPointCoupon {

    // Constructor that takes a TExtraPoint strategy and passes it to the superclass
    public TwentyExtraPointCoupon(TExtraPoint strategy) {
        super(strategy);
    }

    // Overrides the getFRP method to add 20 extra points if there are 4 or more rentals
    @Override
    public int getFRP(List<Rental> rentals) {
        int points = ((TExtraPoint)wrappedStrategy).getFRP(rentals);
        
        if (rentals.size() >= 4) {                 
            points += 20;
        }
        return points;
    }
}