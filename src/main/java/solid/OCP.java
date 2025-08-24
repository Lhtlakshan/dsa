package solid;

public class OCP {
    // class should be open for extension and close for modification


}

// Interface for payment processing
class PaymentProcessor {
    void processPayment(double amount){

    } // Pure virtual function
}

// Credit card payment processor
class CreditCardPaymentProcessor extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}