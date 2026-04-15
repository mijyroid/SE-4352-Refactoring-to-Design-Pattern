public class Main {
    public static void main(String[] args) {
       
        // Create a rental with Regular movie and apply a 50% off coupon
        Rental r = new Rental(
            new Movie("The Matrix", Movie.REGULAR), 
            8, 
            new RegularPriceStrategy(), 
            new RegularFRPStrategy()
        );
        
        Customer customer = new Customer("Hannah Roberts");
        r.setPriceStrategy(new RegularPriceStrategy());
        r. getRentPrice(); // Calculate price without coupon

        // Apply a 50% off coupon
        r.setPriceStrategy(new FiftyPercentOffCoupon(new RegularPriceStrategy()));
        r. getRentPrice(); // Calculate price with 50% off coupon
        
        DiscountedRentalPrice finalPriceLogic = new OneDollarOffCoupon( new FiftyPercentOffCoupon( 
            new RegularPriceStrategy()));
        
        // Set the final price strategy with both coupons applied
        r.setPriceStrategy(finalPriceLogic);
        
        customer.addRental(r); // Add the rental to the customer

        System.out.println("--- Text Statement with Coupons ---");
        System.out.println(customer.statement());

        System.out.println("\n--- XML Statement ---");
        System.out.println(customer.xmlStatement());
    }
}