package com.students.mum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.students.mum.domain.Employee;
import com.students.mum.service.RelationService;

@RestController
public class RelationController {

	@Autowired
	private RelationService relationService;

	@RequestMapping("/")
	public Iterable<Employee> getEmployeeByNumber(@RequestParam("number") String num) {
		return relationService.getEmployeeByNumber(num);
	}

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public void getEmployeeByNumber(@RequestBody Employee emp) {

	    relationService.saveEmployee(emp);
	}
}
