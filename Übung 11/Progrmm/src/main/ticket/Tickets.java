package main.ticket;

import main.person.Person;

public interface Tickets {

    boolean isGueltig(Person person);
    void entweten();
    void kaufTicket(Person person, int type, Person[] gruppe);

}
