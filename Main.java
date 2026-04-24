public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Hannah Roberts");
        
        // 1. Add a free rental using the RedeemPoint strategy
        Rental freeRental = new Rental(
            new Movie("The Matrix", Movie.REGULAR), 
            8, 
            new RedeemPoint(new RegularPriceStrategy()), 
            new RegularFRPStrategy()
        );

        customer.addRental(freeRental);

        // 2. Add a rental with a $5 discount using the FiveDollarDiscount strategy
        customer.addRental(new Rental(
            new Movie("Inception", Movie.REGULAR), 2, new RegularPriceStrategy(), new RegularFRPStrategy()));
        
        customer.addRental(new Rental(
            new Movie("Frozen", Movie.CHILDRENS), 4, new ChildrensPriceStrategy(), new RegularFRPStrategy()));
        
        customer.addRental(new Rental(
            new Movie("Avatar 2", Movie.NEW_RELEASE), 3, new NewReleasePriceStrategy(), new NewReleaseFRPStrategy()));
        
        // 3. Add a rental with a 50% discount using the FiftyPercentOffCoupon strategy
        customer.addRental(new Rental(
            new Movie("The Godfather", Movie.REGULAR), 
            5, 
            new FiftyPercentOffCoupon(new RegularPriceStrategy()), 
            new RegularFRPStrategy()));

        // Print the final statement for the customer
        System.out.println("--- Final Transaction Receipt Statement ---");
        System.out.println(customer.statement());

    }
}