// ChildrensPriceStrategy class that calculates the price for children's movies
class ChildrensPriceStrategy extends RentalPriceStrategy {
    @Override
    public double getPrice(Rental rental) {
        double result = 1.5;
        if (rental.getDaysRented() > 3) {
            result += (rental.getDaysRented() - 3) * 1.5;
        } 
        return result;
    }
}
