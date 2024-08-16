package com.employeemanagement.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "empmodel")
public class EmpModel {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Integer id;

	@Column(name = "FIRST_NAME", nullable = false)
	private String fname;

	@Column(name = "LAST_NAME", nullable = false)
	private String lname;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "PHONE_NUMBER")
	private String phone;

	@Column(name = "HIRE_DATE", nullable = false)
	private LocalDate hireDate;

	@Column(name = "JOB_ID", nullable = false)
	private String jobId;

	@Column(name = "SALARY")
	private Double salary;

	@Column(name = "MANAGER_ID")
	private Integer managerId;

	@Column(name = "DEPARTMENT_ID")
	private Integer deptId;

	public EmpModel() {
		super();
	}

	public EmpModel(Integer id, String fname, String lname, String email, String phone, LocalDate hireDate,
			String jobId, Double salary, Integer managerId, Integer deptId) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.managerId = managerId;
		this.deptId = deptId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}
