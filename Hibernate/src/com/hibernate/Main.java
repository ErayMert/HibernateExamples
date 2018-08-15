package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by eraym on 12.08.2018.
 */
public class Main {


    public static void main(final String[] args) throws Exception {

        Student student1 = new Student("Ferhat", "Aykan", "aykanferhat@gmail.com", "0555", "ADANA");
        Student student2 = new Student("Enes", "Çınar", "enescinar@..", "0554", "SIVAS");
        Student student3 = new Student("Uğur", "Baş", "ugurbas@..", "0553", "BURSA");

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(new Student("Salih", "Öğün", "salih@...", "0555", "ANKARA"));
        session.save(new Student("Levent", "İyibakanlar", "levent@..", "0555", "ESKISEHIR"));
        session.save(new Student("Furkan", "Uslu", "crazyfurkan@..", "0555", "TAVŞANLI"));


        session.beginTransaction().commit();

        session.close();

    }
}