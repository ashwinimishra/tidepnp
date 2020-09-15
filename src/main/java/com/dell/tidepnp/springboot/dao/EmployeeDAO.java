package com.dell.tidepnp.springboot.dao;

import org.springframework.stereotype.Repository;

import com.dell.tidepnp.springboot.model.Employee;
import com.dell.tidepnp.springboot.model.Employees;

@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();

	static {
		list.getEmployeeList().add(new Employee(0, "Sai", "Prasad", "sai_prasad@dell.com"));
		list.getEmployeeList().add(new Employee(1, "Ashwini", "Mishra", "ashwini_mishra@dell.com"));
		list.getEmployeeList().add(new Employee(2, "Sekhar", "Vijaya", "sekhar_vijaya@dell.com"));
	}

	public Employees getAllEmployees() {
		return list;
	}

	public void addEmployee(Employee employee) {
		list.getEmployeeList().add(employee);
	}

	public Employee getEmployeeById(Integer id) {
		return getAllEmployees().getEmployeeList().get(id);
	}
}