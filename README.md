# Movie Rental System - Design Pattern Refactoring

A Java-based movie rental application refactored from legacy code into a highly maintainable and extensible system using modern Software Design Patterns. This project demonstrates the transition from complex conditional logic (switch/if-else) to a robust architecture using **Strategy** and **Decorator** patterns.

## Key Features & Design Patterns

### 1. Pricing & Loyalty Strategy Pattern
Originally handled by nested switch statements, the pricing and Frequent Renter Point (FRP) logic has been decoupled into dedicated strategy hierarchies:
*   **RentalPriceStrategy**: Encapsulates specific pricing math for `Regular`, `Childrens`, and `New Release` movies.
*   **FRPStrategy**: Defines how points are earned, allowing for specialized logic like double points for New Releases without modifying the core `Rental` class.

### 2. Individual Rental Decorators
Implemented a **Decorator Pattern** to allow for dynamic "stackable" coupons and rental-level policies:
*   **RedeemPoint**: A mechanism that checks for 10 frequent renter points to make a specific movie rental free ($0.0).
*   **FiftyPercentOffCoupon**: Applies a 50% discount to the base price of a specific rental.
*   **OneDollarOffCoupon**: Deducts $1.00 for rentals over a specific price threshold.

### 3. Transaction-Level Hierarchy (Cart Logic)
Following a custom architectural whiteboard design, the system features a separate **Transaction Strategy** layer to handle bulk discounts on the total order:
*   **Cart / TransactionPointStrategy**: Sums up individual rental prices (after their decorators are applied).
*   **FiveDollarDiscount (TCoupon)**: A transaction-level decorator that applies a $5.00 discount if the customer rents 5 or more movies in a single transaction.

## Refactoring Rationales
*   **Eliminated Switch Statements**: Replaced "Magic Integers" and complex switch logic with polymorphic objects, fulfilling the **Open/Closed Principle**.
*   **Separation of Concerns**: Moved calculation logic out of the `Customer` and `Movie` classes and into specialized Strategy classes.
*   **Data Type Replacement**: Replaced legacy `Vector` collections with modern `ArrayList` and removed leading underscores from variable names to follow standard Java naming conventions.
*   **XML & Text Output**: Decoupled data calculation from formatting, allowing the system to generate both standard text statements and structured XML outputs.

## Project Structure
*   **Individual Logic**: `DiscountPriceStrategy` → `PriceStrategy` → [Movie Type Strategies] & `Coupon` → [Coupon Decorators]
*   **Transaction Logic**: `DiscountTransactionStrategy` → `TransactionPointStrategy` → `Cart` & `TCoupon` → [Bulk Discounts]

## How to Run
1.  Compile all Java files:
    ```bash
    javac *.java
    ```
2.  Run the main tester class:
    ```bash
    java Main
    ```

## Contributors
*   **Oluwawemimo Jayeoba**
*   **Sundus Tosun**

---
*Developed as part of SE 4352 - Software Architecture and Design Patterns.*
