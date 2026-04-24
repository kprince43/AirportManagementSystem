package airport.operation;

import airport.Flights.Flight;

public class Schedule {

    private String scheduleId;
    private Flight flight;
    private Gate gate;
    private String departureTime;

    public Schedule(String scheduleId, Flight flight,
                    Gate gate, String departureTime) {
        this.scheduleId = scheduleId;
        this.flight = flight;
        this.gate = gate;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "ID='" + scheduleId + '\'' +
                ", Flight=" + flight.getName() +
                ", Gate=" + gate +
                ", Departure='" + departureTime + '\'' +
                '}';
    }
}