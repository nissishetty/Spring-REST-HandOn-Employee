package com.cognizant.SR.service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cognizant.SR.model.Employee;

@Service
public class EmployeeService {
	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
	ArrayList<Employee> employees = context.getBean("empList",ArrayList.class);

	public List<Employee> getAllEmployees() {

		LOGGER.debug("Fetch All Employees called");
		return employees;
	}
	
	
	public Employee getEmployeeById(int id) {
		LOGGER.debug("Fetch Employees by Id called");	
		Employee emp = new Employee();
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			 emp = (Employee) itr.next();
			 if (emp.getId() == id) {
				 break;
			}
			emp=null;
		}
		return emp;
	}

	public List<Employee> delete(int id) {
		LOGGER.debug("Delete Employee");
		Employee employee = new Employee();
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
			 employee = (Employee) itr.next();
			 if (employee.getId() == id) {
				 employees.remove(id);
				 break;
				
			}
			employee=null;
		}
		return employees;
	}
}
