// For New Releases, customers earn 2 points if rented for more than 1 day
class NewReleaseFRPStrategy implements FRPStrategy {
    public int getFRP(Rental rental) {
        return (rental.getDaysRented() > 1) ? 2 : 1; // Return 2 points if rented for more than 1 day, otherwise return 1 point
    }
}
