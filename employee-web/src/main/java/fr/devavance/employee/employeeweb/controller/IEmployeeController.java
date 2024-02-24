package fr.devavance.employee.employeeweb.controller;

import fr.devavance.employee.employeecore.core.entity.Employee;
import org.springframework.ui.Model;

public interface IEmployeeController {
    public String displayHome(Model model);
    public String addEmployee(Employee employee);
    public String displayEmployee(Long id,  Model model);
}
