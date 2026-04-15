// Represents the regular price strategy for rentals
class RegularPriceStrategy extends DiscountedRentalPrice {
    @Override
    public double getRentalPrice(Rental rental) {
        double result = 2;
        if (rental.getDaysRented() > 2) {
            result += (rental.getDaysRented() - 2) * 1.5;
        } 
        return result; // Regular rentals cost $2 for the first 2 days, and $1.5 per day thereafter
    }
}
