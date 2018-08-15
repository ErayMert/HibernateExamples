package namedQueryHibarnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.type.StringType;
import queryHibernate.Workers;

import java.util.List;

/**
 * Created by eraym on 15.08.2018.
 */
public class TestNamedQuery {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/namedQueryHibarnate/hibernate.cfg.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Workers_2 workers;

        for (int i=1; i<=10; i++){
            workers = new Workers_2("name" + i, "surname" + i, i*50);
            session.save(workers);
        }

        Query query = session.getNamedQuery("ourNamedQuery.byId");
        query.setParameter(1,5);

        List list = (List) query.list();

        for (Object i: list){
            Workers_2 w = (Workers_2) i;
            System.out.println(w.getName() + " " + w.getSurname() + " " + w.getSalary());
        }

        query = session.getNamedQuery("ourNamedNativeQuery.byName");
        query.setParameter(1,"name7", StringType.INSTANCE);
        list = (List) query.list();


        for (Object i: list){

            Workers_2 w = (Workers_2) i;

            System.out.println(w.getName() +" " + w.getSurname() + " " + w.getSalary());
        }

        session.getTransaction().commit();
        session.close();

    }
}
