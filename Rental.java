public class Rental {
    private Movie movie;
    private int daysRented;
    private DiscountedRentalPrice priceStrategy; //Strategy for price calculation
    private FRPStrategy frpStrategy; //Strategy for frequent renter points calculation

    // The Rental constructor now takes in the strategies as parameters
    public Rental(Movie movie, int daysRented, DiscountedRentalPrice ps, FRPStrategy frps) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.priceStrategy = ps;
        this.frpStrategy = frps;
    }

    //Allow dynamic couponing
    public void setPriceStrategy(DiscountedRentalPrice ps) {
        this.priceStrategy = ps;
    }

    public void setFRPStrategy(FRPStrategy frps) {
        this.frpStrategy = frps;
    }

    public int getDaysRented() { 
        return daysRented; 
    }

    public Movie getMovie() { 
        return movie; 
    }

    //Delegate the price calculation to the assigned Price Strategy
    public double getRentPrice() {
        return priceStrategy.getRentalPrice(this);
    }

    //Delegate the FRP calculation to the assigned FRP Strategy
    public int getFRP() {
        return frpStrategy.getFRP(this);
    }
}