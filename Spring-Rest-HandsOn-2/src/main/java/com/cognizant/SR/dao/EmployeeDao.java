package com.cognizant.SR.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.SR.model.Employee;
import com.cognizant.SR.service.EmployeeService;


// CLASS IS NOT USED ANYWHERE


@Repository
public class EmployeeDao {
	
	
	public static List<Employee> EMPLOYEE_LIST=new ArrayList<>();

	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	@SuppressWarnings("unchecked")
	public EmployeeDao() {
		LOGGER.debug("EmployeeDao called");
		@SuppressWarnings("resource")
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Employee.xml");
		EMPLOYEE_LIST=(ArrayList<Employee>) ctx.getBean("empList");
	}
	public List<Employee> getAllEmployee(){
		return EMPLOYEE_LIST;
		
	}

}
