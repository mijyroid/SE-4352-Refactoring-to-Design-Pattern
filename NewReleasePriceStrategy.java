// NewReleasePriceStrategy class that calculates the price for new release movies
class NewReleasePriceStrategy extends RentalPriceStrategy {
    @Override
    public double getPrice(Rental rental) {
        return rental.getDaysRented() * 3.0;
    }
}