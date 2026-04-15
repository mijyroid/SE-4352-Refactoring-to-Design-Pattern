// Children price strategy: $1.5 for the first 3 days, and $1.5 per day thereafter.
class ChildrensPriceStrategy extends DiscountedRentalPrice {
    @Override
    public double getRentalPrice(Rental rental) {
        double result = 1.5;
        if (rental.getDaysRented() > 3) {
            result += (rental.getDaysRented() - 3) * 1.5;
        } 
        return result;
    }
}