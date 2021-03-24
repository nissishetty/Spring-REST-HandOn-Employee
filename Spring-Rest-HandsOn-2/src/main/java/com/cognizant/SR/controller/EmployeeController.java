package com.cognizant.SR.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SR.model.Department;
import com.cognizant.SR.model.Employee;
import com.cognizant.SR.service.DepartmentService;
import com.cognizant.SR.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();

	}

	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();

	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@RequestBody Employee emp,@PathVariable("id") int empId) {
		Employee existingEmployee = employeeService.getEmployeeById(empId);
		existingEmployee.setName(emp.getName());
		existingEmployee.setSalary(emp.getSalary());
		return existingEmployee.toString();
		
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") int id) {
		
		return this.employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public List<Employee> deleteEmployee(@PathVariable("id") int id) {
		return this.employeeService.delete(id);
		
		
		
	}
}
