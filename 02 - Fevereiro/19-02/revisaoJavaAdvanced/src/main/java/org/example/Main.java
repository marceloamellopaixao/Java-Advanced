package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EventManager manager = new EventManager();
        // Criar eventos
        try {
            manager = null;
            Event teamMeeting = new Event(LocalDateTime.of(2024, 3, 15, 10, 0), "Reunião de equipe");
            manager.createEvent(teamMeeting);
            Event clientCall = new Event(LocalDateTime.of(2024, 3, 16, 15, 0), "Chamada com cliente");
            manager.createEvent(clientCall);
            teamMeeting.setStatus(EventStatus.ONGOING);
            clientCall.setStatus(EventStatus.COMPLETED);

            List<Event> events = manager.getEvents();
            for (Event event : events) {
                System.out.println  (formatEvent(event));
            }

        } catch (Exception e) {
            System.out.println("Erro ao criar evento: " + e.getMessage());
        }
    }

    private static String formatEvent(Event event) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Evento: " + event.getDescription()
                + ", Data/Hora: " + event.getDateTime().format(formatter)
                + ", Status: " + event.getStatus();
    }
}