package elementCollection;

import javax.persistence.*;
import java.util.List;

/**
 * Created by eraym on 14.08.2018.
 */

@Entity(name = "Ogrenci")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    private String name;
    private String surname;
    private int year;

    @ElementCollection
    @CollectionTable(name = "Student_Email", joinColumns = @JoinColumn(name="student_id"))
    @Column(name = "Email")
    private List<String> emails;

    @ElementCollection
    @CollectionTable(name = "Student_PhoneNumber", joinColumns = @JoinColumn(name = "student_phone"))
    @Column(name = "Phone_Number")
    private List<String> phoneNumbers;

    public Student(){

    }

    public Student(String name, String surname, int year, List<String> emails, List<String> phoneNumbers) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.emails = emails;
        this.phoneNumbers = phoneNumbers;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
