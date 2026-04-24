import java.util.List;

public class DiscountTransactionStrategy {
    public abstract double getPrice(List<Rental> rentals);
}
