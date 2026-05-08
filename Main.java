public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Hannah Roberts");

        // Free rental — no FRP bonus
        customer.addRental(new Rental(
            new Movie("The Matrix", Movie.REGULAR), 8,
            new RedeemPoint(new RegularPriceStrategy()),
            new RegularFRPStrategy()
        ));

        // Implementation (a) - TenExtraPointCoupon wraps FRPStrategy — +10 FRP if price >= $10
        customer.addRental(new Rental(
            new Movie("Inception", Movie.REGULAR), 2,
            new RegularPriceStrategy(),
            new TenExtraPointCoupon(new RegularFRPStrategy())));

        customer.addRental(new Rental(
            new Movie("Frozen", Movie.CHILDRENS), 4,
            new ChildrensPriceStrategy(),
            new TenExtraPointCoupon(new RegularFRPStrategy())));

        customer.addRental(new Rental(
            new Movie("Avatar 2", Movie.NEW_RELEASE), 3,
            new NewReleasePriceStrategy(),
            new TenExtraPointCoupon(new NewReleaseFRPStrategy())));

        customer.addRental(new Rental(
            new Movie("The Godfather", Movie.REGULAR), 5,
            new FiftyPercentOffCoupon(new RegularPriceStrategy()),
            new TenExtraPointCoupon(new RegularFRPStrategy())));

        customer.addRental(new Rental(
            new Movie("Dune 2", Movie.NEW_RELEASE), 4,
            new NewReleasePriceStrategy(),
            new TenExtraPointCoupon(new NewReleaseFRPStrategy())));

        // Implementation (b) works in Customer — +20 FRP for 5 rentals (>= 4)
        System.out.println("--- Final Transaction Receipt Statement ---");
        System.out.println(customer.statement());
        System.out.println();

        System.out.println("--- Final Transaction Receipt Statement in XML Format ---");
        System.out.println(customer.xmlStatement());
    }
}
