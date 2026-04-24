package airport.passenger;

import airport.Flights.Flight;

public class Ticket {

    private String ticketId;
    private Passenger passenger;
    private Flight flight;
    private String seat;
    private double price;

    public Ticket(String ticketId, Passenger passenger, Flight flight,
                  String seat, double price) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        this.price = price;
    }

    public void generateDetails() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + passenger.getFullName());
        System.out.println("Flight: " + flight);
        System.out.println("Seat: " + seat);
        System.out.println("Price: $" + price);
    }
}