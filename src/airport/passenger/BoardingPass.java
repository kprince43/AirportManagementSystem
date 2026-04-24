package airport.passenger;

import java.time.LocalTime;

public class BoardingPass {

    private String boardingPassId;
    private Ticket ticket; 
    private String gateNumber;
    private LocalTime boardingTime;

    public BoardingPass(String boardingPassId,
                        Ticket ticket,
                        String gateNumber,
                        LocalTime boardingTime) {
        this.boardingPassId = boardingPassId;
        this.ticket = ticket;
        this.gateNumber = gateNumber;
        this.boardingTime = boardingTime;
    }

    @Override
    public String toString() {
        return "BoardingPass{" +
                "ID='" + boardingPassId + '\'' +
                ", Gate='" + gateNumber + '\'' +
                ", Boarding Time=" + boardingTime +
                '}';
    }
}