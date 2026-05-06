public class NewReleaseFRPStrategy extends FRPStrategy {

    @Override
    public int getFRP(Rental rental) {
        if (rental.getDaysRented() > 1) {
            return 2;
        }
        return 1;
    }
}
