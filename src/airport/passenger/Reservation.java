package airport.passenger;

import airport.Flights.Flight;
import java.time.LocalDate;

public class Reservation {

    private String reservationId;
    private Passenger passenger;
    private Flight flight;
    private LocalDate date;
    private String status;

    public Reservation(String reservationId, Passenger passenger, Flight flight) {
        this.reservationId = reservationId;
        this.passenger = passenger;
        this.flight = flight;
        this.date = LocalDate.now();
        this.status = "CONFIRMED";
    }

    @Override
    public String toString() {
        return "Reservation{ID='" + reservationId +
                "', Passenger='" + passenger.getFullName() +
                "', Flight='" + flight.getFlightNumber() +
                "', Date=" + date +
                ", Status='" + status + "'}";
    }
}