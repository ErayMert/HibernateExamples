package com.hibernate;

import javax.persistence.*;

/**
 * Created by eraym on 12.08.2018.
 */
@Entity(name = "My_Student")
//@Table(name = "My_Student")
@SecondaryTable(name = "StudentDetail")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id")
    private int studentId;

    @Column(name = "Student_Name")
    private String name;

    @Column(name = "Student_Surname")
    private String surname;

    @Column(name = "Email", table = "StudentDetail")
    private String email;

    @Column(table = "StudentDetail")
    private String phone;

    @Column(table = "StudentDetail")
    private String adress;

    public Student() {
    }

    public Student( String name, String surname, String email, String phone, String adress){
        super();
        this.name = name;
        this.surname =surname;
        this.email = email;
        this.phone = phone;
        this.adress =adress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
