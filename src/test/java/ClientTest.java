import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import util.ClientLevel;
import util.ClientType;

public class ClientTest {

    public static void main(String[] args){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Client client = new Client();
        client.setClientLevel(ClientLevel.A);
        client.setClientType(ClientType.Buyer);
        client.setId(1);

        session.save(client);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
