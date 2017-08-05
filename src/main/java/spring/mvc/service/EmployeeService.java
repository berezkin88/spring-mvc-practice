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
    public List getEmployees() {
        return employeeDao.findAll();
    }

    @Transactional
    public Employee getEmployee(String employeeName) {
        return employeeDao.findByName(employeeName);
    }

    @Transactional
    public List listEmployeesNameAndSurname(){
        return employeeDao.findAllNameAndSurname();
    }

    @Transactional
    public List findEmployeesByNames(String target) {
        return employeeDao.findByParam(target);
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
