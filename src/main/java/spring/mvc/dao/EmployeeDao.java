package spring.mvc.dao;


import spring.mvc.Model.Employee;

import java.util.List;

/**
 * Created by Alexander on 28/04/2017.
 */
public interface EmployeeDao {

    void save(Employee employee);

    Employee load(Long id);

    List findAll();

    public List findAllNameAndSurname();

    Employee findByName(String name);

    List findByParam(String target);

    void remove(Employee employee);

    void removeAll();
}
