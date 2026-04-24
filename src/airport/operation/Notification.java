package airport.operation;

import java.time.LocalDateTime;

public class Notification {

    private String notificationId;
    private String message;
    private String recipient;
    private LocalDateTime date;

    public Notification(String notificationId,
                        String message,
                        String recipient) {
        this.notificationId = notificationId;
        this.message = message;
        this.recipient = recipient;
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Notification{" +
                "ID='" + notificationId + '\'' +
                ", Message='" + message + '\'' +
                ", Recipient='" + recipient + '\'' +
                ", Date=" + date +
                '}';
    }
}