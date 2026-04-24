// For New Releases, customers earn 2 points if rented for more than 1 day
class NewReleaseFRPStrategy implements FRPStrategy {
    public int getFRP(Rental rental) {
        if (rental.getDaysRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
