package com.dell.tidepnp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dell.tidepnp.springboot.model.EmployeeEntity;
import com.dell.tidepnp.springboot.service.EmployeeService;

@RestController
@RequestMapping(path = "/api/v1")
public class EmployeePersistController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ResponseEntity<List<EmployeeEntity>> getEmployees() {
		final List<EmployeeEntity> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
}
