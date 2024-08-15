package com.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.entity.EmpModel;
import com.employeemanagement.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public List<EmpModel> getAllEmployees(){
		return repo.findAll();
	}
	
}
