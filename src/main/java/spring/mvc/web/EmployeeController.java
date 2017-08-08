package spring.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.mvc.Model.Employee;
import spring.mvc.service.EmployeeService;

import java.util.List;
import java.util.Map;

/**
 * Created by Alexander on 23/06/2017.
 */
@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List employee(Map<String, Object> model) {
        return employeeService.listEmployeesNameAndSurname();
    }

    @RequestMapping(value = "/employee/{employeeName}", method = RequestMethod.GET)
    public Employee employee(@PathVariable String employeeName) {
        return employeeService.getEmployee(employeeName);
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee employee(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }



    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
