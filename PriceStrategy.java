public interface PriceStrategy {
    double getRentalPrice(Rental rental); // Takes the whole Rental object as a parameter
}

//Strategy for Regular Movies: $2 for 2 days, $1.50 per day after
class RegularPriceStrategy implements PriceStrategy {
    public double getRentalPrice(Rental rental) {
        double result = 2;
        if (rental.getDaysRented() > 2) {
            result += (rental.getDaysRented() - 2) * 1.5;
        } 
        return result;
    }
}

//Strategy for Children's Movies: $1.50 for 3 days, $1.50 per day after
class ChildrensPriceStrategy implements PriceStrategy {
    public double getRentalPrice(Rental rental) {
        double result = 1.5;
        if (rental.getDaysRented() > 3) {
            result += (rental.getDaysRented() - 3) * 1.5;
        } 
        return result;
    }
}

//Strategy for New Releases: $3 per day
class NewReleasePriceStrategy implements PriceStrategy {
    public double getRentalPrice(Rental rental) {
        return rental.getDaysRented() * 3.0;
    }
}
