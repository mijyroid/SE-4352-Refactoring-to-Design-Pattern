public class Main {
    public static void main(String[] args) {
        // Create some movies
        Movie regularMovie = new Movie("The Matrix", Movie.REGULAR);
        Movie childrensMovie = new Movie("Frozen", Movie.CHILDRENS);
        Movie newReleaseMovie = new Movie("Oppenheimer", Movie.NEW_RELEASE);

        Customer customer = new Customer("Hannah Roberts");

        // Requirement: Add rentals with appropriate strategies
        customer.addRental(new Rental(regularMovie, 3, new RegularPriceStrategy(), new RegularFRPStrategy()));
        customer.addRental(new Rental(childrensMovie, 4, new ChildrensPriceStrategy(), new RegularFRPStrategy()));
        customer.addRental(new Rental(newReleaseMovie, 2, new NewReleasePriceStrategy(), new NewReleaseFRPStrategy()));

        System.out.println("--- Text Statement ---");
        System.out.println(customer.statement());

        System.out.println("\n--- XML Statement ---");
        System.out.println(customer.xmlStatement());
    }
}