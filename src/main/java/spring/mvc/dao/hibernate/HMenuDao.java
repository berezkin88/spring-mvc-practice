package spring.mvc.dao.hibernate;

import org.hibernate.SessionFactory;
import spring.mvc.Model.Menu;
import spring.mvc.dao.MenuDao;

import java.util.List;

public class HMenuDao implements MenuDao {

    private SessionFactory sessionFactory;

    @Override
    public List listMenus() {
        return sessionFactory.getCurrentSession().createQuery("select m.title from Menu m").list();
    }

    @Override
    public Menu findMenuById(Integer id) {
        return sessionFactory.getCurrentSession().load(Menu.class, id);
    }

    @Override
    public Menu findMenuByTitle(String title) {
        return (Menu) sessionFactory.getCurrentSession().
                createQuery("select m from Menu m where m.title like:title").
                setParameter("title", title).uniqueResult();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
