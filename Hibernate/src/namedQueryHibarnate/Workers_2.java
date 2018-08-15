package namedQueryHibarnate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by eraym on 15.08.2018.
 */

@Entity
@NamedQuery(name = "ourNamedQuery.byId", query = "from namedQueryHibarnate.Workers_2 where worker_id = ?1")
@NamedNativeQuery(name = "ourNamedNativeQuery.byName", query = "Select * from Workers_2 where name=?1", resultClass = Workers_2.class)

public class Workers_2 implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int worker_id;
    private String name;
    private String surname;
    private int salary;

    public Workers_2(){

    }

    public Workers_2(String name, String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
