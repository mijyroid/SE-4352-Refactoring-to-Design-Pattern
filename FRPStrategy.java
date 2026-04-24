// FRPStrategy interface that defines the method to calculate frequent renter points for a rental
public interface FRPStrategy {
    int getFRP(Rental rental);
}