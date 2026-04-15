// For Regular and Children's movies, customers earn 1 point per rental
class RegularFRPStrategy implements FRPStrategy {
    public int getFRP(Rental rental) {
        return 1;
    }
}

