package airport.operation;

public class Gate {

    private String gateId;
    private Terminal terminal;
    private String status; // OPEN / CLOSED

    public Gate(String gateId, Terminal terminal, String status) {
        this.gateId = gateId;
        this.terminal = terminal;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "ID='" + gateId + '\'' +
                ", Terminal='" + terminal + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}