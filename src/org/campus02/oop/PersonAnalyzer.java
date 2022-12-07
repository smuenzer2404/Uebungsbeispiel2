package org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {
    public ArrayList<Person> persons = new ArrayList<>();

    public abstract void analyze();

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}
