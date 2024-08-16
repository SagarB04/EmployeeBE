package com.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.entity.EmpModel;
import com.employeemanagement.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo repo;

	/**
	 * getting all employees list
	 */
	public List<EmpModel> getAllEmployees() {
		return repo.findAll();
	}

	/**
	 * get one one employee by id
	 */
	public EmpModel getEmployeebyId(int id) {
		Optional<EmpModel> emp = repo.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		}
		return null;
	}

	/**
	 * delete employee by id
	 */
	public String deleteEmployeebyId(int id) {
		try {
			repo.deleteById(id);

		} catch (Exception e) {
			System.err.println(e);
		}
		return "deletion performed";
	}

	/*
	 * save employee
	 */
	public EmpModel saveEmployee(EmpModel emp) {
		return repo.save(emp);
	}

	/*
	 * update employee
	 */
	public EmpModel updateEmployee(EmpModel emp) {
		return repo.save(emp);
	}
	
}
