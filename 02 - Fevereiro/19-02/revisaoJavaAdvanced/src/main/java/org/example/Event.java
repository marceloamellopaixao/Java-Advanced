package org.example;

import java.time.LocalDateTime;

public class Event {
    private LocalDateTime dateTime;
    private String description;
    private EventStatus status;

    public Event(LocalDateTime dateTime, String description) {
        this.dateTime = dateTime;
        this.description = description;
        this.status = EventStatus.PLANNED;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }
}