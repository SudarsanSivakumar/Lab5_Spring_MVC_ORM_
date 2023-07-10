package com.employeemanagement.service;

import java.util.List;



import com.employeemanagement.entity.Employee;


public interface EmployeeService {

	//findAll
	List<Employee> findAll();
	
	// find by id 
	Employee findById(int id);

	//insert
	void save(Employee employee);

	//delete
	void deleteById(int id);
	
	

}