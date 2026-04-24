import java.util.List;

public class FiveDollarDiscount extends TCoupon {
    public FiveDollarDiscount(DiscountTransactionStrategy strategy) {
        super(strategy);
    }

    @Override
    public double getPrice(List<Rental> rentals) {
        double total = super.getPrice(rentals);

        if (rentals.size() >= 5) {
            return total - 5.0;
        }
        return total;
    }
}
