package com.cognizant.SR.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.SR.model.Department;

@Service
public class DepartmentService {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
	
	public List<Department> getAllDepartments() {
		
		List<Department> departments = new ArrayList<>();
		departments = context.getBean("departmentList",ArrayList.class);
		return departments;
		
	}

}
