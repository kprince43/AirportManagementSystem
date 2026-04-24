package airport.operation;

import airport.passenger.Passenger;

public class SecurityCheck {

    private String checkId;
    private Passenger passenger;
    private String status; // CLEARED / FAILED
    private String remarks;

    public SecurityCheck(String checkId, Passenger passenger, String status, String remarks) {
        this.checkId = checkId;
        this.passenger = passenger;
        this.status = status;
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "SecurityCheck{" +
                "CheckID='" + checkId + '\'' +
                ", Passenger=" + passenger.getFullName() +
                ", Status='" + status + '\'' +
                ", Remarks='" + remarks + '\'' +
                '}';
    }
}