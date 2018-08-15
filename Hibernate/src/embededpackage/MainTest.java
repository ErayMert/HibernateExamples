package embededpackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by eraym on 13.08.2018.
 */
public class MainTest {

    public static void main(String[] args) {
        People person1 = new People("Ferhat", "Aykan", 1994);
        People person2 = new People("Enes", "Çınar", 1994);
        People person3 = new People("Uğur", "Baş", 1995);

        People person4 = new People("Hasan", "Yildiz", 1970);
        People person5 = new People("Osman", "Kaya", 1980);


        Teacher teacher1 = new Teacher(person4, "Matematik");
        Teacher teacher2 = new Teacher(person5, "Fizik");

        Students student1 = new Students(person1, "DPU");
        Students student2 = new Students(person2, "ODTU");
        Students student3 = new Students(person3, "YTU");

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();

        session.save(teacher1);
        session.save(teacher2);

        session.save(student1);
        session.save(student2);
        session.save(student3);


        session.beginTransaction().commit();
        session.close();
    }
}
