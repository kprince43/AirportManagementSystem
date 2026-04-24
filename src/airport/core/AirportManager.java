package airport.core;

public class AirportManager extends AirportEntity
        implements Reservable, Payable, Trackable {

    private String airportName;
    private int terminalNumber;
    private String managerName;
    private String currentLocation;

    // Default constructor
    public AirportManager() {
        super();
    }

    // Parameterized constructor (✅ FIXED)
    public AirportManager(
            String entityId,
            String name,
            String status,
            String airportName,
            int terminalNumber,
            String managerName
    ) {
        super(entityId, name, status); // ✅ CORRECT
        this.airportName = airportName;
        this.terminalNumber = terminalNumber;
        this.managerName = managerName;
    }

    // ===== Reservable =====
    @Override
    public void createReservation() {
        System.out.println("Reservation created by manager.");
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reservation cancelled by manager.");
    }

    @Override
    public void modifyReservation() {
        System.out.println("Reservation modified by manager.");
    }

    // ===== Payable =====
    @Override
    public void processPayment() {
        System.out.println("Payment processed.");
    }

    @Override
    public double calculateAmount() {
        return 0;
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt generated.");
    }

    // ===== Trackable =====
    @Override
    public void trackStatus() {
        System.out.println("Tracking manager status.");
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // ===== AirportEntity abstract methods =====
    @Override
    public boolean validateEntity() {
        return managerName != null && !managerName.isEmpty();
    }

    @Override
    public void activateEntity() {
        setStatus("ACTIVE");
    }

    @Override
    public void deactivateEntity() {
        setStatus("INACTIVE");
    }

    @Override
    public void updateDetails() {
        System.out.println("Updating Airport Manager details.");
    }

    @Override
    public void generateReport() {
        System.out.println("Airport Manager Report generated.");
    }

    @Override
    public void logActivity(String activity) {
        System.out.println("Manager Activity: " + activity);
    }

    @Override
    public String checkStatus() {
        return getStatus();
    }

    @Override
    public void archiveEntity() {
        setStatus("ARCHIVED");
    }

    @Override
    public void restoreEntity() {
        setStatus("RESTORED");
    }

    @Override
    public void displaySummary() {
        System.out.println(
                "Manager: " + managerName +
                " | Airport: " + airportName +
                " | Terminal: " + terminalNumber
        );
    }
}