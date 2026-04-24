package airport.Flights;

public class DomesticFlight extends Flight {

    private String regionCode;

    public DomesticFlight(String entityId, String flightNumber, String airline,
                          String from, String to, int capacity, String regionCode) {
        super(entityId, flightNumber, airline, from, to, capacity);
        this.regionCode = regionCode;
    }

    @Override
    public void updateDetails() {
        System.out.println("Updating Domestic Flight details");
    }

    @Override
    public void generateReport() {
        System.out.println("Domestic Flight Report for " + flightNumber);
    }
}