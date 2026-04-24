// RegularPriceStrategy class that calculates the price for regular movies
class RegularPriceStrategy extends RentalPriceStrategy {
    @Override
    public double getPrice(Rental rental) {
        double result = 2;
        if (rental.getDaysRented() > 2) {
            result += (rental.getDaysRented() - 2) * 1.5;
        }
        return result;
    }
}
