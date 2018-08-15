package oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by eraym on 14.08.2018.
 */
public class TestOneToOne {
    public static void main(String[] args) {

        Adress adress1 = new Adress("Cumhuriyet cad.", "Ankara", "Turkiye");
        Adress adress2 = new Adress("Çankaya cad", "Ankara", "Turkiye");
        Adress adress3 = new Adress("Kazım Karabekir cad.", "Ankara", "Turkiye");

        Student student1 = new Student("Ferhat", "Aykan", adress3);
        Student student2 = new Student("Enes", "Çınar", adress1);
        Student student3 = new Student("Uğur", "Baş", adress2);


        SessionFactory sessionFactory = new Configuration().configure("/oneToOne/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(adress1);
        session.save(adress2);
        session.save(adress3);


        session.beginTransaction().commit();
        session.close();
    }
}
