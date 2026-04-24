package airport.core;

import java.time.LocalDateTime;

public abstract class AirportEntity {

    private String entityId;
    private String name;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdated;

    // Default constructor
    public AirportEntity() {
        this.createdDate = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
    }

    // Parameterized constructor
    public AirportEntity(String entityId, String name, String status) {
        this.entityId = entityId;
        this.name = name;
        this.status = status;
        this.createdDate = LocalDateTime.now();
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters & Setters
    public String getEntityId() { return entityId; }
    public void setEntityId(String entityId) { this.entityId = entityId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getCreatedDate() { return createdDate; }
    public LocalDateTime getLastUpdated() { return lastUpdated; }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [ID=" + entityId +
                ", Name=" + name +
                ", Status=" + status + "]";
    }

    // Abstract contracts
    public abstract boolean validateEntity();
    public abstract void activateEntity();
    public abstract void deactivateEntity();
    public abstract void updateDetails();
    public abstract void generateReport();
    public abstract void logActivity(String activity);
    public abstract String checkStatus();
    public abstract void archiveEntity();
    public abstract void restoreEntity();
    public abstract void displaySummary();
}