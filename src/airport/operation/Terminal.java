package airport.operation;

public class Terminal {

    private String terminalId;
    private String name;
    private int capacity;

    public Terminal(String terminalId, String name, int capacity) {
        this.terminalId = terminalId;
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "ID='" + terminalId + '\'' +
                ", Name='" + name + '\'' +
                ", Capacity=" + capacity +
                '}';
    }
}