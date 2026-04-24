import java.util.List;

// DiscountTransactionStrategy class that calculates the total price of rentals with discounts
public abstract class DiscountTransactionStrategy {
    public abstract double getPrice(List<Rental> rentals);
}
