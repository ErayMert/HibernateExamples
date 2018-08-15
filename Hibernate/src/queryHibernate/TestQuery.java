package queryHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;


/**
 * Created by eraym on 14.08.2018.
 */
public class TestQuery {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("/queryHibernate/hibernate.cfg.xml").buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Workers workers;

        for (int i=1; i<=10; i++){
            workers = new Workers("name" + i, "surname" + i, i*50);
            session.save(workers);
        }

        String hql = "FROM Workers";
        Query query = session.createQuery(hql);
        List results = query.list();

        System.out.println("size of list result= " + results.size());

        for (Iterator it = results.iterator(); it.hasNext();){
            Workers i = (Workers) it.next();
            System.out.println(i.getName() + " " + i.getSurname() + " " + i.getSalary());
        }

        System.out.println("____Result Maximum List____");
        query.setFirstResult(5);
        query.setMaxResults(3);
        List resultMax = (List) query.list();

        for (Object i: resultMax){

            Workers w = (Workers) i;

            System.out.println(w.getName() +" " + w.getSurname() + " " + w.getSalary());
        }


        System.out.println(query.getQueryString());
        session.getTransaction().commit();
        session.close();
    }
}
