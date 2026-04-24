// Movie class that represents a movie with a title and price code
public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String name; 
    private int priceCode;

    public Movie(String name, int priceCode) {
        this.name = name;
        this.priceCode = priceCode;
    }

    public String getTitle() { 
        return name; 
    }

    public int getPriceCode() { 
        return priceCode; 
    }
}