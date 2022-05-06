package main.car;

import main.person.Arbeiter;
import main.person.Person;
import main.ticket.Ticket;

public class Bus {

    private Arbeiter fahrer;
    private Person[] mitfahrer;

    public void createBus(int bussGroesse, Arbeiter fahrer) {
        this.fahrer = fahrer;
        mitfahrer = new Person[bussGroesse];
    }

    public boolean addPerson(Ticket ticket, Person person) {
        ticket.entweten();
        boolean r = false;
        for (int i = 0; i < mitfahrer.length; i++) {
            if (mitfahrer[i] == null) {
                mitfahrer[i] = person;
                r = true;
                break;
            }
        }
        return r;
    }

    public boolean ticketCheck(Ticket ticket) {
        boolean r = false;
        for (Person person : mitfahrer) {
            r = ticket.isGueltig(person);
        }
        return r;
    }

}
