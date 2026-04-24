public class Rental {
    private Movie movie;
    private int daysRented;
    private DiscountPriceStrategy priceStrategy;
    private FRPStrategy frpStrategy; 

    public Rental(Movie movie, int daysRented, DiscountPriceStrategy ps, FRPStrategy frps) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.priceStrategy = ps;
        this.frpStrategy = frps;
    }

    public double getRentPrice() {
        return priceStrategy.getPrice(this);
    }

    public void setPriceStrategy(DiscountPriceStrategy ps) {
        this.priceStrategy = ps;
    }

    public int getFRP() {
        return frpStrategy.getFRP(this);
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}