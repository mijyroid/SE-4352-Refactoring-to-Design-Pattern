class NewReleasePriceStrategy extends RentalPriceStrategy {
    @Override
    public double getPrice(Rental rental) {
        return rental.getDaysRented() * 3.0;
    }
}