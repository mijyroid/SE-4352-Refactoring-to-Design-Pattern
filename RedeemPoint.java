public class RedeemPoint extends Coupon {
    
    public RedeemPoint(DiscountPriceStrategy drps) {
        super(drps);
    }

    @Override
    public double getPrice(Rental rental) {
        double price = super.getFree();
        return price;
    }
}