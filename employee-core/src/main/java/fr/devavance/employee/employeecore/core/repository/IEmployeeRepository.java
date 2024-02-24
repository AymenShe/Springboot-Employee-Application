package fr.devavance.employee.employeecore.core.repository;

import fr.devavance.employee.employeecore.core.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IEmployeeRepository extends JpaRepository<Employee, Long>  {


}
