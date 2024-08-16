package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.entity.EmpModel;
import com.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmpModel emp;

	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	public List<EmpModel> getAllemployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/employee")
	public EmpModel getEmployeeById(@RequestParam int id) {
		return service.getEmployeebyId(id);
	}

	@GetMapping("/employee/delete")
	public String deleteEmployeebyId(@RequestParam int id) {
		return service.deleteEmployeebyId(id);
	}

	@PostMapping("/employee/save")
	public EmpModel saveEmployee(@RequestBody EmpModel emp) {
		return service.saveEmployee(emp);
	}
	
	@PostMapping("/employee/update")
	public EmpModel updateEmployee(@RequestBody EmpModel emp) {
		return service.updateEmployee(emp);
	}

}
