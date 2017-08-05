package spring.mvc.dao.hibernate;

import org.hibernate.SessionFactory;
import spring.mvc.Model.Orders;

import spring.mvc.dao.OrderDao;
import java.util.List;

/**
 * Created by Alexander on 29/04/2017.
 */
public class HOrderDao implements OrderDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Orders order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public List<Orders> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select o from Orders o").list();
    }

    @Override
    public List findAllOpen() {
        return sessionFactory.getCurrentSession().createQuery("select o from Orders o where o.status='OPEN'").list();
    }

    @Override
    public List findAllClosed() {
        return sessionFactory.getCurrentSession().createQuery("select o from Orders o where o.status='CLOSE'").list();
    }

    @Override
    public Orders findById(Integer id) {
        return sessionFactory.getCurrentSession().load(Orders.class, id);
    }

    @Override
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("delete from Orders").executeUpdate();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
