public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Hannah Roberts");
        
        // 1. Requirement A: Redeem 10 points for a free movie
        // Use the RedeemPoint decorator
        Rental freeRental = new Rental(
            new Movie("The Matrix", Movie.REGULAR), 
            8, 
            new RedeemPoint(new RegularPriceStrategy()), 
            new RegularFRPStrategy()
        );
        customer.addRental(freeRental);

        // 2. Add 4 more rentals to reach a total of 5 rentals
        // Requirement B: $5 off for a transaction of 5 or more rentals
        customer.addRental(new Rental(
            new Movie("Inception", Movie.REGULAR), 2, new RegularPriceStrategy(), new RegularFRPStrategy()));
        
        customer.addRental(new Rental(
            new Movie("Frozen", Movie.CHILDRENS), 4, new ChildrensPriceStrategy(), new RegularFRPStrategy()));
        
        customer.addRental(new Rental(
            new Movie("Avatar 2", Movie.NEW_RELEASE), 3, new NewReleasePriceStrategy(), new NewReleaseFRPStrategy()));
        
        // Let's apply a 50% coupon to this specific rental too
        customer.addRental(new Rental(
            new Movie("The Godfather", Movie.REGULAR), 
            5, 
            new FiftyPercentOffCoupon(new RegularPriceStrategy()), 
            new RegularFRPStrategy()));

        // Print the statement
        // This will show one free movie (RedeemPoint)
        // AND the final total will have $5 subtracted (FiveDollarDiscount)
        System.out.println("--- Final Statement ---");
        System.out.println(customer.statement());

    }
}