package airport.core;

public interface Payable {
    void processPayment();
    double calculateAmount();
    void generateReceipt();
}