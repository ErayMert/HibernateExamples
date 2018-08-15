package oneToOne;

import javax.persistence.*;

/**
 * Created by eraym on 14.08.2018.
 */
@Entity(name = "NewStudent")
public class Student {

    @Id
    @SequenceGenerator(name = "Student_Sequence_Generator", sequenceName = "Student_Sequence", initialValue = 100)
    @GeneratedValue(generator = "Student_Sequence_Generator")
    @Column(name = "St_Id")
    private int studentId;

    @Column(name = "Name", unique = false)
    private String name;

    @Column(name = "Surname")
    private String surname;

    @OneToOne
    private Adress adress;


    public Student() {
    }

    public Student(String name, String surname, Adress adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student[" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress=" + adress +
                ']';
    }
}
