package spring.mvc.dao.hibernate;

import org.hibernate.SessionFactory;
import spring.mvc.Model.Dish;
import spring.mvc.dao.DishDao;

import java.util.List;

/**
 * Created by Alexander on 29/04/2017.
 */
public class HDishDao implements DishDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    @Override
    public List<Dish> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select d from Dish d").list();
    }

    @Override
    public Dish findByName(String name) {
        return (Dish) sessionFactory.getCurrentSession().createQuery("SELECT d from Dish d where d.name like :name").setParameter("name", name).uniqueResult();
    }

    @Override
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("delete from Dish").executeUpdate();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
