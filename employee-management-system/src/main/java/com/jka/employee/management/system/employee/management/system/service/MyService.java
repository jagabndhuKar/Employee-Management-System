package com.jka.employee.management.system.employee.management.system.service;

import java.util.List;
import java.util.Optional;

import com.jka.employee.management.system.employee.management.system.Entety.Employee;

public interface MyService {
public String m1();

public Employee saveEmployee(Employee employee);

public Optional<Employee>getEmployeeById(int id);

public List<Employee> getAllEmployee();

public Employee updateEmployee(int id, Employee employee);

void deleteEmployee(int id);
}
