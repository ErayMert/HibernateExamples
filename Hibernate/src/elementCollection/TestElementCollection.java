package elementCollection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eraym on 14.08.2018.
 */
public class TestElementCollection {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<String>();
        List<String> phoneNumbers = new ArrayList<String>();

        emails.add("aykanferhat@gmail.com");
        emails.add("aykanferhat@hotmail.com");
        emails.add("aykan@hotmail.com");

        phoneNumbers.add("055555");
        phoneNumbers.add("066666");
        phoneNumbers.add("077777");

        Student student = new Student("Ferhat", "Aykna", 1994, emails, phoneNumbers);

        SessionFactory factory = new Configuration().configure("/elementCollection/hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();

        session.save(student);

        session.beginTransaction().commit();
        session.close();

    }
}