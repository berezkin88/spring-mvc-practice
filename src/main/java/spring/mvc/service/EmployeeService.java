package spring.mvc.service;

import spring.mvc.Model.Employee;
import spring.mvc.dao.EmployeeDao;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Alexander on 23/06/2017.
 */
public class EmployeeService {

    private EmployeeDao employeeDao;

    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.findAll();
    }

    @Transactional
    public Employee getEmployee(String employeeName) {
        return employeeDao.findByName(employeeName);
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
