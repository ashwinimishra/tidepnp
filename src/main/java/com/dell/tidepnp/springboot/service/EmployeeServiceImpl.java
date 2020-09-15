package com.dell.tidepnp.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dell.tidepnp.springboot.dao.EmployeeRepository;
import com.dell.tidepnp.springboot.model.EmployeeEntity;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	public List<EmployeeEntity> getAllEmployees() {
		return (List<EmployeeEntity>) repo.findAll();
	}
}
