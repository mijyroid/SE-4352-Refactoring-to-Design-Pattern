import java.util.List;

// FiveDollarDiscount class that applies a $5 discount if there are 5 or more rentals
public class FiveDollarDiscount extends TCoupon {
    public FiveDollarDiscount(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    // Applies a $5 discount if there are 5 or more rentals
    @Override
    public double getPrice(List<Rental> rentals) {
        double total = super.getPrice(rentals);

        if (rentals.size() >= 5) {
            return total - 5.0;
        }
        return total;
    }
}
