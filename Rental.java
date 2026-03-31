public class Rental {
    private Movie movie;
    private int daysRented;
    private PriceStrategy priceStrategy; //Strategy for price calculation
    private FRPStrategy frpStrategy; //Strategy for frequent renter points calculation

    // The Rental constructor now takes in the strategies as parameters
    public Rental(Movie movie, int daysRented, PriceStrategy ps, FRPStrategy frps) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.priceStrategy = ps;
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