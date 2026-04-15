// Strategy for New Releases
class NewReleasePriceStrategy extends DiscountedRentalPrice {
    @Override
    public double getRentalPrice(Rental rental) {
        return rental.getDaysRented() * 3.0; // New Releases cost $3 per day
    }
}
