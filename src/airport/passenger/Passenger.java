package airport.passenger;

public class Passenger {

    private String passengerId;
    private String fullName;
    private String passportNumber;

    public Passenger(String passengerId, String fullName, String passportNumber) {
        this.passengerId = passengerId;
        this.fullName = fullName;
        this.passportNumber = passportNumber;
    }

    public String getFullName() {
        return fullName;
    }
}