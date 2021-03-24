package com.cognizant.SR.model;

import java.util.Date;
import java.util.Set;

public class Employee {
	private int id;	
	private String name;
	private double salary;
	private boolean permanent;
	private Date dateOfBirth;
	private Department department;
	private Set<Skill> skillList;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public Department getDepartment() {
		return department;
	}
	public Set<Skill> getSkillList() {
		return skillList;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void setSkillList(Set<Skill> skillList) {
		this.skillList = skillList;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + ", department=" + department + ", skillList=" + skillList + "]";
	}

}
