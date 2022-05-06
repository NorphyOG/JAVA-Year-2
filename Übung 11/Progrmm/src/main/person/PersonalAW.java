package main.person;

import java.time.LocalDate;

public class PersonalAW implements PersonalAusweiss {

    private LocalDate ablaufDate;
    private String id;
    private LocalDate erstellungsDate;
    private Person personData;

    @Override
    public void newPA(Person person) {
        setID(person);
        erstellungsDate = LocalDate.now();
        ablaufDate = LocalDate.of(LocalDate.now().getYear() + 6, LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        personData = person;
    }

    private void setID(Person person) {
        id = String.valueOf(person.getLand().charAt(0));
        id = id + person.getVorname().charAt(0);
        id = id + person.getNachname().charAt(0);
        id = id + person.getAugenFabe().charAt(0);
        id = id + person.getAlter();
        id = id + person.getStrasse().charAt(0);
    }

    public LocalDate getAblaufDate() {
        return ablaufDate;
    }

    public void setAblaufDate(LocalDate ablaufDate) {
        this.ablaufDate = ablaufDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getErstellungsDate() {
        return erstellungsDate;
    }

    public void setErstellungsDate(LocalDate erstellungsDate) {
        this.erstellungsDate = erstellungsDate;
    }

    public Person getPersonData() {
        return personData;
    }

    public void setPersonData(Person personData) {
        this.personData = personData;
    }
}
