package fr.devavance.employee.employeecore.core.service;

import fr.devavance.employee.employeecore.core.entity.Employee;

import java.util.ArrayList;
import java.util.Optional;


public interface IEmployeeService {
    public ArrayList<Employee> findAll();
    public void save(Employee employee);
    public Optional<Employee> findById(Long id);
    public void delete(Long id);
}