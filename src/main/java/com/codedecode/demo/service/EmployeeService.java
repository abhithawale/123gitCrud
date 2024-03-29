package com.codedecode.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repos.EmployeeCrudRepos;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	@Autowired
	private EmployeeCrudRepos crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
	    Employee savedEmployee = crudRepo.save(employee);
	    return savedEmployee;
	}	

	@Override
	public List<Employee> getAllEmployees() {
		return crudRepo.findAll();
	}

	@Override
	public Employee getEmpById(Long empidL) {
      return crudRepo.findById(empidL).get();
	}

	@Override
	public void deleteEmpById(Long empidL) {
		crudRepo.deleteById(empidL);
		
	}

	/*
	 * @Override 
	 * public Employee updateEmployee(Employee employee) {
	 * Employee updateEmployee = crudRepo.save(employee); return updateEmployee; 
	 * }
	 */
	
}
