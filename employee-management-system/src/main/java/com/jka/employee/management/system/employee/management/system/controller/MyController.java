package com.jka.employee.management.system.employee.management.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jka.employee.management.system.employee.management.system.Entety.Employee;
import com.jka.employee.management.system.employee.management.system.service.MyService;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class MyController {
	@Autowired
	MyService service;

	@GetMapping("/wellcome")
	public String wellcome() {
		return service.m1();
	}

	@GetMapping
	public List<Employee> getAllEmployee() {
		return service.getAllEmployee();
	}

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@GetMapping("/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return service.updateEmployee(id, employee);
	}

	@DeleteMapping("/{id}")
	public void dateEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
	}
}
