import java.util.List;

public class Cart extends TransactionPointStrategy {
    @Override
    public double getPrice(List<Rental> rentals) {
        double total = 0;
        for (Rental rental : rentals) {
            total += rental.getRentPrice();
        }
        return total;
    }
}