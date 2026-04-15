class RegularPriceStrategy extends DiscountedRentalPrice {
    @Override
    public double getRentalPrice(Rental rental) {
        double result = 2;
        if (rental.getDaysRented() > 2) {
            result += (rental.getDaysRented() - 2) * 1.5;
        } 
        return result;
    }
}

// Strategy for Children's Movies
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

// Strategy for New Releases
class NewReleasePriceStrategy extends DiscountedRentalPrice {
    @Override
    public double getRentalPrice(Rental rental) {
        return rental.getDaysRented() * 3.0;
    }
}
