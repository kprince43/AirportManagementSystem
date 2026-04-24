package airport.Flights;

public class InternationalFlight extends Flight {

    private boolean passportRequired;

    public InternationalFlight(String entityId, String flightNumber, String airline,
                               String from, String to, int capacity, boolean passportRequired) {
        super(entityId, flightNumber, airline, from, to, capacity);
        this.passportRequired = passportRequired;
    }

    @Override
    public void updateDetails() {
        System.out.println("Updating International Flight details");
    }

    @Override
    public void generateReport() {
        System.out.println("International Flight Report for " + flightNumber);
    }
}