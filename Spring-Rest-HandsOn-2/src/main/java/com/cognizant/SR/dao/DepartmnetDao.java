package com.cognizant.SR.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.SR.model.Department;
import com.cognizant.SR.service.EmployeeService;


// CLASS IS NOT USED ANY WHERE




@Repository
public class DepartmnetDao {
	
	public static List<Department> DEPARTMENT_LIST = new ArrayList<Department>();
	private static final Logger LOGGER=LoggerFactory.getLogger(EmployeeService.class);
	@SuppressWarnings("unchecked")
	public DepartmnetDao() {
		LOGGER.debug("DepartmentDao called");
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Employee.xml");
		DEPARTMENT_LIST = (ArrayList<Department>) ctx.getBean("departmentList");
	}

	public List<Department> getallEmployee() {
		return DEPARTMENT_LIST;
	}

}
