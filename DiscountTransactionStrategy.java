import java.util.List;

public abstract class DiscountTransactionStrategy {
    public abstract double getPrice(List<Rental> rentals);
}
