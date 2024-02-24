package fr.devavance.employee.employeeweb.controller.implementation;

import fr.devavance.employee.employeecore.core.service.IEmployeeService;
import fr.devavance.employee.employeeweb.controller.IEmployeeController;
import fr.devavance.employee.employeecore.core.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeControleur implements IEmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @RequestMapping(value ="/home", method = RequestMethod.GET)
    public String displayHome(Model model){
        model.addAttribute("employees",iEmployeeService.findAll());
        model.addAttribute("employee",new Employee());
        return "view_home";
    }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee){
        iEmployeeService.save(employee);

        return "redirect:/employee/home";
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String displayEmployee(@PathVariable(name = "id") Long id, Model model){

        this.iEmployeeService.findById(id).ifPresentOrElse(employee -> model.addAttribute("employee_selected",employee),() -> model.addAttribute("employee_selected", new Employee()));
        return "view_employee";
    }
}
