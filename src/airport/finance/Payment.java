package airport.finance;

public class Payment {

    private String paymentId;
    private double amount;
    private String paymentMethod; // CASH / CARD / MOBILE
    private String paymentStatus; // SUCCESS / FAILED

    public Payment(String paymentId, double amount,
                   String paymentMethod, String paymentStatus) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "ID='" + paymentId + '\'' +
                ", Amount=" + amount +
                ", Method='" + paymentMethod + '\'' +
                ", Status='" + paymentStatus + '\'' +
                '}';
    }
}