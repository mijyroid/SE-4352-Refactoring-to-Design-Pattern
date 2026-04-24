import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    // Adds a rental to the customer's list of rentals
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    // Requirement: Text Format Method
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" + 
                      String.valueOf(rental.getRentPrice()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
                  " frequent renter points";
        return result;
    }

    // Requirement: XML Format Method
    public String xmlStatement() {

        String result = "<customer>\n";

        result += "  <name>" + getName() + "</name>\n";

        for (Rental rental : rentals) {
            result += "  <rental>\n";
            result += "    <movie>" + rental.getMovie().getTitle() + "</movie>\n";
            result += "    <daysRented>" + rental.getDaysRented() + "</daysRented>\n";
            result += "    <charge>" + rental.getRentPrice() + "</charge>\n";
            result += "  </rental>\n";
        }

        result += "  <totalAmount>" + getTotalCharge() + "</totalAmount>\n";
        result += "  <frequentRenterPoints>"
                + getTotalFrequentRenterPoints()
                + "</frequentRenterPoints>\n";

        result += "</customer>";

        return result;
    }

    // Sums up all rental charges using the assigned Transaction Strategy
    private double getTotalCharge() {
        DiscountTransactionStrategy transaction = new Cart();
        transaction = new FiveDollarDiscount(transaction);
        return transaction.getPrice(this.rentals);
    }

    // Sums up all frequent renter points using the assigned Transaction Point Strategy
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        for (Rental rental : rentals) {
            result += rental.getFRP();
        }
        return result;
    }
}