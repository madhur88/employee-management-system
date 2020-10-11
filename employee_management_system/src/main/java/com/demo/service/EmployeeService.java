package com.demo.service;

import java.util.List;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

public class EmployeeService {
	EmployeeDAO empDAO;
	
	public void addNewEmployee(Employee emp) {
		empDAO.addNewEmployee(emp);
	}
	
	public List<Employee> getAllEmployees() {
		return empDAO.getAllEmployees();
	}
	
	public void setEmpDAO(EmployeeDAO empDAO) {
		this.empDAO = empDAO;
	}

}
