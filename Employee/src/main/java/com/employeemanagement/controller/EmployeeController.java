package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.entity.EmpModel;
import com.employeemanagement.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<EmpModel> getAllemployees() {
		return service.getAllEmployees();
	}
	
}
