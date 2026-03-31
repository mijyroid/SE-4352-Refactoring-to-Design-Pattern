public interface FRPStrategy {
    int getFRP(Rental rental);
}

// For Regular and Children's movies, customers earn 1 point per rental
class RegularFRPStrategy implements FRPStrategy {
    public int getFRP(Rental rental) {
        return 1;
    }
}

// For New Releases, customers earn 2 points if rented for more than 1 day
class NewReleaseFRPStrategy implements FRPStrategy {
    public int getFRP(Rental rental) {
        return (rental.getDaysRented() > 1) ? 2 : 1;
    }
}