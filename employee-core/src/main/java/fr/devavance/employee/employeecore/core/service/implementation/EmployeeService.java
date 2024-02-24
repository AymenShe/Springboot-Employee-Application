package fr.devavance.employee.employeecore.core.service.implementation;

import fr.devavance.employee.employeecore.core.service.IEmployeeService;
import fr.devavance.employee.employeecore.core.entity.Employee;
import fr.devavance.employee.employeecore.core.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;


    @Override
    public ArrayList<Employee> findAll() {
        return (ArrayList<Employee>) this.employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public Optional<Employee> findById(Long id) {
        return this.employeeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {

    }
}
