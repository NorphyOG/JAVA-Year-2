package main.ticket;

import main.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Ticket implements  Tickets{

    private LocalDate erstellungsDate;
    private LocalDate ablaufDate;
    private String ticketID;
    private ArrayList<Person> personGehoerigkeit;
    private String ticketType;
    private int farten;
    private int usedFahrten = 0;

    @Override
    public boolean isGueltig(Person person) {
        boolean r = true;
        if (farten != 0) {
            r = farten <= usedFahrten;
        }
        if (ablaufDate.isAfter(LocalDate.now())) {
            return false;
        }
        for (Person person1 : personGehoerigkeit) {
            if (person != person1) {
                return false;
            }
        }
        return r;
    }

    @Override
    public void entweten() {
        usedFahrten++;
    }

    private void setID() {
        ticketID = String.valueOf(ticketType.charAt(0));
        ticketID = ticketID + (int) (Math.random() * 9999);
    }

    @Override
    public void kaufTicket(Person person, int type, Person[] gruppe) {
        erstellungsDate = LocalDate.now();

        switch (type) {
            case 0 -> {
                ticketType = "Einzelticket";
                ablaufDate = LocalDate.now();
                farten = 1;
                personGehoerigkeit.add(person);
            }
            case 1 -> {
                ticketType = "Mehrfahrticket";
                farten = 4;
                ablaufDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth() + 6);
                personGehoerigkeit.add(person);
            }
            case 2 -> {
                ticketType = "Jahresticket";
                farten = 0;
                ablaufDate = LocalDate.of(LocalDate.now().getYear() + 1, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
                personGehoerigkeit.add(person);
            }
            case 3 -> {
                ticketType = "Gruppenticket";
                farten = 1;
                ablaufDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth() + 6);
                Collections.addAll(personGehoerigkeit, gruppe);
            }
            default -> System.err.println("[kaufTicket] Falscher Type");
        }

        setID();

    }

    public int getUsedFahrten() {
        return usedFahrten;
    }

    public void setUsedFahrten(int usedFahrten) {
        this.usedFahrten = usedFahrten;
    }
}
