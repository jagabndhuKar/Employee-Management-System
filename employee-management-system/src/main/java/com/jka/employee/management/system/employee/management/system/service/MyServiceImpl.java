package com.jka.employee.management.system.employee.management.system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.jka.employee.management.system.employee.management.system.Entety.Employee;
import com.jka.employee.management.system.employee.management.system.repo.EmployeeRepo;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public String m1() {
		return "wellcome on one ";
	}

	@Override
	public Employee saveEmployee(Employee employee) {
	return employeeRepo.save(employee); 
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepo.findById(id);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Employee toUpdateEmployee = employeeRepo.findById(id).orElseThrow();
			toUpdateEmployee.setFirstName(employee.getFirstName());
			toUpdateEmployee.setLastName(employee.getLastName());
			toUpdateEmployee.setEmail(employee.getEmail());
		return employeeRepo.save(toUpdateEmployee);
	}

	@Override
	public void deleteEmployee(int id) {
      employeeRepo.deleteById(id);		
	}

}
