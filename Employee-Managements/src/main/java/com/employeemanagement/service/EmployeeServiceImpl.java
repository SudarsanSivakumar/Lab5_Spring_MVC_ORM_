package com.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.dao.EmployeeRepository;
import com.employeemanagement.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository; 
	//findAll
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	// find by id 
	@Override
	public Employee findById(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		Employee employee = null;
		if(result.isPresent()) {
			employee = result.get();
		}else {
			throw new RuntimeException("Did not found - "  +id);
			
		}
		return employee;
	}

	
	//insert
		@Override
		public void save(Employee employee){
			employeeRepository.save(employee);
		}
	//delete
	@Override
	public void deleteById(int id){
		employeeRepository.deleteById(id);
	}
	
}
