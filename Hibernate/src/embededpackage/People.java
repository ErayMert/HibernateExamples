package embededpackage;

import javax.persistence.Embeddable;

/**
 * Created by eraym on 13.08.2018.
 */

@Embeddable
public class People {

    private String name;
    private String surname;
    private int year;

    public People() {

    }

    public People(String name, String surname, int year)
    {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
