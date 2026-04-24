public class RedeemPoint extends Coupon {
    
    public RedeemPoint(DiscountPriceStrategy drps) {
        super(drps);
    }

    @Override
    public double getPrice(Rental rental) {
        System.out.println("Checking frequent renter points... (10 points found)");
        return super.getFree();
    }
}