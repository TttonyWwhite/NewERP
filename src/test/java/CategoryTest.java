import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

public class CategoryTest {

    public static void main(String[] args){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration
                .buildSessionFactory();

        Category category = new Category();
        //category.setId(1);
        category.setName("cellphones");
        category.setLeaf(true);

        Goods goods1 = new Goods();
        //goods1.setId(1);
        goods1.setGoodsName("iphone");
        goods1.setCategory(category);

        Goods goods2 = new Goods();
        //goods1.setId(2);
        goods2.setGoodsName("mi");
        goods2.setCategory(category);

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.saveOrUpdate(category);
        session.saveOrUpdate(goods1);
        session.saveOrUpdate(goods2);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }

}
