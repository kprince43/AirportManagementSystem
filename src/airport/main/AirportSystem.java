package airport.main;

import airport.Flights.*;
import airport.passenger.*;
import airport.util.InputValidator;

import java.util.Scanner;

public class AirportSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Airport Management System ===");
        System.out.println("Choose Flight Type:");
        System.out.println("[1] Domestic Flight");
        System.out.println("[2] International Flight");
        System.out.print("Enter option (1 or 2): ");

        int option = InputValidator.getValidOption(sc, 1, 2);

        String flightType = (option == 1) ? "DOMESTIC" : "INTERNATIONAL";

        System.out.print("Enter Flight Number: ");
        String flightNumber =
                InputValidator.getNonEmptyString(sc, "Flight Number");

        Flight flight = FlightFactory.createFlight(
                flightType,
                "F001",
                flightNumber,
                "RwandAir",
                "Kigali",
                "Huye",
                150
        );

        System.out.print("Enter Passenger Name: ");
        String name =
                InputValidator.getNonEmptyString(sc, "Passenger Name");

        System.out.print("Enter Passport Number: ");
        String passport =
                InputValidator.getValidPassport(sc);

        Passenger passenger = new Passenger(
                "P001",
                name,
                passport
        );

        Ticket ticket = new Ticket(
                "T001",
                passenger,
                flight,
                "12A",
                400
        );

        Reservation reservation = new Reservation(
                "R001",
                passenger,
                flight
        );

        System.out.println("\n--- Ticket Details ---");
        ticket.generateDetails();

        System.out.println("\n--- Reservation ---");
        System.out.println(reservation);

        sc.close();
    }
}