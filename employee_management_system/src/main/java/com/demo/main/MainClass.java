package com.demo.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class MainClass {

	public static void main(String[] args) {
		
		//Loading SpringContaoner using applicationContext.xml
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService empService = container.getBean(EmployeeService.class);
		
		Employee emp1 = new Employee("101", "Madhur", "Developer", 30000);
		Employee emp2 = new Employee("102", "Tarun", "Tester", 25000);
		Employee emp3 = new Employee("103", "Teena", "Product Owner", 35000);
		Employee emp4 = new Employee("104", "Deepak", "Manager", 40000);
		
		empService.addNewEmployee(emp1);
		empService.addNewEmployee(emp2);
		empService.addNewEmployee(emp3);
		empService.addNewEmployee(emp4);
		
		List<Employee> employees = empService.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getempName());
		}
		
		container.close();


	}

}
