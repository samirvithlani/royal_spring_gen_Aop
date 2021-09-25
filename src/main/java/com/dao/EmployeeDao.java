package com.dao;

import org.springframework.stereotype.Repository;

@Repository("emp")
public class EmployeeDao {

	
	public void login() {
		
		System.out.println("Dao login methos");
	}
	
	public void logout() {
		
		System.out.println("Employee Dao logout...");
	}
}
