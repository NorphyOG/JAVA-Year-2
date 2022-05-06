package main;

import main.car.Bus;
import main.person.Arbeiter;
import main.person.Person;
import main.ticket.Ticket;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        Person person = new Person("Jerome", "Weber", LocalDate.of(2002, 04, 30), "DE", "Aachen", "Blau/Grau", 187, 53757, "Sankt Augustin", "Mendener Str.", 71);
        Arbeiter arbeiter = new Arbeiter("Ne", "Ma", LocalDate.of(2005, 1, 20), "DE", "Bonn", "Grau", 180, 53727, "Sakt Augustin", "Mendener Str.", 71, "Buss Fahrer", true);

        Ticket ticket1 = new Ticket();
        ticket1.kaufTicket(person, 1, null);

        bus.createBus(30, arbeiter);
        bus.addPerson(ticket1, person);

        bus.ticketCheck(ticket1);
        ticket1.isGueltig(person);

    }
}
