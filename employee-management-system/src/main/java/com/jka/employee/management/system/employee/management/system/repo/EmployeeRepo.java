package com.jka.employee.management.system.employee.management.system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jka.employee.management.system.employee.management.system.Entety.Employee;

@Repository 
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
