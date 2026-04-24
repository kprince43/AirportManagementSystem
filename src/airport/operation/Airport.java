package airport.operation;

public class Airport {

    private String airportId;
    private String name;
    private String location;
    private int numberOfTerminals;

    public Airport(String airportId, String name, String location, int numberOfTerminals) {
        this.airportId = airportId;
        this.name = name;
        this.location = location;
        this.numberOfTerminals = numberOfTerminals;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "ID='" + airportId + '\'' +
                ", Name='" + name + '\'' +
                ", Location='" + location + '\'' +
                ", Terminals=" + numberOfTerminals +
                '}';
    }
}