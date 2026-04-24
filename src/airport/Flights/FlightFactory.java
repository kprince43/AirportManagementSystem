package airport.Flights;

public class FlightFactory {

    public static Flight createFlight(
            String type,
            String entityId,
            String flightNumber,
            String airline,
            String from,
            String to,
            int capacity
    ) {

        switch (type.toUpperCase()) {

            case "DOMESTIC":
                return new DomesticFlight(
                        entityId,
                        flightNumber,
                        airline,
                        from,
                        to,
                        capacity,
                        "RW" // regionCode
                );

            case "INTERNATIONAL":
                return new InternationalFlight(
                        entityId,
                        flightNumber,
                        airline,
                        from,
                        to,
                        capacity,
                        true // passportRequired
                );

            default:
                throw new IllegalArgumentException(
                        "Invalid flight type: " + type
                );
        }
    }
}