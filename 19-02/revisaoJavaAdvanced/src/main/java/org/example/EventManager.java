package org.example;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements UserInterface {
    private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    @Override
    public void createEvent(Event event) {
        events.add(event);
    }

    @Override
    public void cancelEvent(Event event) {
        events.remove(event);
    }

    public List<Event> getEvents() {
        return events;
    }

}