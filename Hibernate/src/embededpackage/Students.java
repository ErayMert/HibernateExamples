package embededpackage;

import javax.persistence.*;

/**
 * Created by eraym on 13.08.2018.
 */

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Embedded
    private People people;

    @Column(name = "SCHOOL")
    private String schoolName;

    public Students(){

    }

    public Students(People people, String schoolName){
        this.people = people;
        this.schoolName = schoolName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
