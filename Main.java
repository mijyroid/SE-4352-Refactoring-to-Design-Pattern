public class Main {
    public static void main(String[] args) {
        // Create some movies
        Movie regularMovie = new Movie("The Matrix", Movie.REGULAR);
        Movie childrensMovie = new Movie("Frozen", Movie.CHILDRENS);
        Movie newReleaseMovie = new Movie("Oppenheimer", Movie.NEW_RELEASE);

        Customer customer = new Customer("Hannah Roberts");
        
        // Regular Rental: No Coupon
        customer.addRental(new Rental(regularMovie, 2, 
            new RegularPriceStrategy(), new RegularFRPStrategy()));

        // Requirement (a): 50% Off Coupon applied to a Children's Movie
        customer.addRental(new Rental(childrensMovie, 10, 
            new FiftyPercentOffCoupon(new ChildrensPriceStrategy()), 
            new RegularFRPStrategy()));

        // Requirement (b): $1 Off Coupon for rentals > $5 applied to a New Release
        customer.addRental(new Rental(newReleaseMovie, 2, 
            new OneDollarOffCoupon(new NewReleasePriceStrategy()), 
            new NewReleaseFRPStrategy()));

        System.out.println("--- Text Statement with Coupons ---");
        System.out.println(customer.statement());

        System.out.println("\n--- XML Statement ---");
        System.out.println(customer.xmlStatement());
    }
}