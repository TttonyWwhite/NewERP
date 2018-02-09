
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class AccountTest {

    public static void main(String[] args){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Account account = new Account();
        account.setId(2);
        account.setAmount(12.3);
        session.save(account);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
