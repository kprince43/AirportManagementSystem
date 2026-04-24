package airport.Flights;

import airport.core.AirportEntity;

public abstract class Flight extends AirportEntity {

    protected String flightNumber;
    protected String airline;
    protected String from;
    protected String to;
    protected int capacity;

    public Flight(String entityId, String flightNumber, String airline,
                  String from, String to, int capacity) {
        super(entityId, flightNumber, "SCHEDULED");
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.capacity = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean validateEntity() {
        return capacity > 0;
    }

    @Override
    public void activateEntity() {
        setStatus("ACTIVE");
    }

    @Override
    public void deactivateEntity() {
        setStatus("CANCELLED");
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
        System.out.println(toString());
    }

    @Override
    public void logActivity(String activity) {
        System.out.println("LOG: " + activity);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [FlightNumber=" + flightNumber +
                ", From=" + from +
                ", To=" + to + "]";
    }
}