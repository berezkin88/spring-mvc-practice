package spring.mvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
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
    public List<Employee> employee (Map<String, Object> model){
        return employeeService.getEmployees();
        }

    @RequestMapping(value = "/employee/{employeeName}", method = RequestMethod.GET)
    public Employee employee (@PathVariable String employeeName){
        return employeeService.getEmployee(employeeName);
        }

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
