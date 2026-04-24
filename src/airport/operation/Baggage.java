package airport.operation;

import airport.passenger.Passenger;

public class Baggage {

    private String baggageId;
    private double weight;
    private Passenger owner;
    private String status; // CHECKED_IN / LOADED / LOST

    public Baggage(String baggageId, double weight, Passenger owner, String status) {
        this.baggageId = baggageId;
        this.weight = weight;
        this.owner = owner;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "ID='" + baggageId + '\'' +
                ", Weight=" + weight +
                ", Owner=" + owner.getFullName() +
                ", Status='" + status + '\'' +
                '}';
    }
}