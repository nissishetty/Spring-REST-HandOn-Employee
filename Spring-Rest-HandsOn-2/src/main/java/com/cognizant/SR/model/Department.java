package com.cognizant.SR.model;

public class Department {
	private int did;
	private String dname;
	public int getDid() {
		return did;
	}
	public String getDname() {
		return dname;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}

}
