public abstract class FRPStrategy extends ExtraPointStrategy {

    // Abstract method to calculate frequent renter points for a given rental
    @Override
    public abstract int getFRP(Rental rental);
}
