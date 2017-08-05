package spring.mvc.dao.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import spring.mvc.Model.Employee;
import spring.mvc.dao.EmployeeDao;

import java.util.List;


/**
 * Created by Alexander on 28/04/2017.
 */
public class HEmployeeDao implements EmployeeDao {

    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public Employee load(Long id) {
        return sessionFactory.getCurrentSession().load(Employee.class, id);
    }

    @Override
    public List findAll() {
        return sessionFactory.getCurrentSession().createQuery("SELECT e from Employee e").list();
    }

    @Override
    public List findAllNameAndSurname() {
        return sessionFactory.getCurrentSession().createQuery("SELECT e.name, e.surname from Employee e").list();
    }

    @Override
    public Employee findByName(String name) {
        return (Employee) sessionFactory.getCurrentSession().createQuery("SELECT e from Employee e where e.name like :name").
                setParameter("name", name).uniqueResult();
    }

    @Override
    public List findByParam(String target) {
        return sessionFactory.getCurrentSession().
                createQuery("SELECT e from Employee e where e.name or e.surname like :target").
                setParameter("target", target).list();
    }

    @Override
    public void remove(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("delete from Employee").executeUpdate();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
