// abstract Price class to define the interface for pricing strategies
abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);

    //Default for frequent renter points
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

// Concrete Price classes to handle specific pricing strategies
class RegularPrice extends Price {
    int getPriceCode() { 
        return Movie.REGULAR; 
    }

    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) result += (daysRented - 2) * 1.5;
        return result;
    }
}

class ChildrensPrice extends Price {
    int getPriceCode() { 
        return Movie.CHILDRENS; 
    }

    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) result += (daysRented - 3) * 1.5;
        return result;
    }
}

class NewReleasePrice extends Price {
    int getPriceCode() { 
        return Movie.NEW_RELEASE; 
    }
    
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}




