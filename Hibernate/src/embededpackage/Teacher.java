package embededpackage;

import javax.persistence.*;

/**
 * Created by eraym on 13.08.2018.
 */

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;

    @Embedded
    private People people;

    @Column(name = "Barnch")
    private String teacherBranch;

    public Teacher(){

    }

    public Teacher( People people, String teacherBranch)
    {
        this.people = people;
        this.teacherBranch = teacherBranch;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public String getTeacherBranch() {
        return teacherBranch;
    }

    public void setTeacherBranch(String teacherBranch) {
        this.teacherBranch = teacherBranch;
    }
}
