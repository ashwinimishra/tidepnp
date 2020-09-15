package com.dell.tidepnp.springboot.service;

import java.util.List;

import com.dell.tidepnp.springboot.model.EmployeeEntity;

public interface EmployeeService {
	public List<EmployeeEntity> getAllEmployees();
}
