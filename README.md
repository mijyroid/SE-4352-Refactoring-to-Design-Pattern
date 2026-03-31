# SE-4352-Code-Refactoring

### Renaming Operations:
1. Update each to eachRental in the Customer class

### Updating Data Types:
1. Updated _rentals in the Customer class to be an ArrayList instead of a Vector

### Method Extraction:
1. Created the addRentalPoints() method so that we could reduce how much stuff Customer.statement() has to do.

### Method Move:
1. Moved Customer.addRentalPoints() to Rental.addRentalPoints() since it made more sense to calculate rental points inside the rental class, since the rental is what determines the number of points a customer will recieve.

### Adding Classes:
1. Added MoviesRentalTest, which contains the basic outline of the main method
