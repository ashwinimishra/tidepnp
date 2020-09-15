package com.dell.tidepnp.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dell.tidepnp.springboot.dao.EmployeeDAO;
import com.dell.tidepnp.springboot.model.Employee;
import com.dell.tidepnp.springboot.model.Employees;

@RestController
@RequestMapping(path = "/api/v1")
public class DemoAPIController {

	@Autowired
	private EmployeeDAO employeeDao;

	@GetMapping(path = "/", produces = "application/json")
	public Employees getEmployees() {
		return employeeDao.getAllEmployees();
	}

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public Employees addEmployee(@RequestBody Employee employee) {
		Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
		employee.setId(id);
		employeeDao.addEmployee(employee);
		return employeeDao.getAllEmployees();
	}

//	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
//	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
//		Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
//		employee.setId(id);
//
//		employeeDao.addEmployee(employee);
//
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId())
//				.toUri();
//
//		return ResponseEntity.created(location).build();
//	}
//	@PutMapping("/employees/{id}")
//	  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Integer id) {
//
//	    return employeeDao.getEmployeeById(id)
//	      .map(employee -> {
//	        employee.setName(newEmployee.getName());
//	        employee.setRole(newEmployee.getRole());
//	        return repository.save(employee);
//	      })
//	      .orElseGet(() -> {
//	        newEmployee.setId(id);
//	        return repository.save(newEmployee);
//	      });
//	  }
}
