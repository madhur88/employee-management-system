package com.demo.model;

public class Employee {
	
	private String empId;
	private String empName;
	private String empDesignation;
	private long empSalary;
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation="
				+ empDesignation + ", empSalary=" + empSalary + "]";
	}

	
	public Employee(String empId, String empName, String empDesignation, long empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	
	public String getempId() {
		return empId;
	}
	public void setempId(String empId) {
		this.empId = empId;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getempDesignation() {
		return empDesignation;
	}
	public void setempDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public long getempSalary() {
		return empSalary;
	}
	public void setempSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	
	
	

}
