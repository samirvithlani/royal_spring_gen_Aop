package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.dao.EmployeeDao;

public class Client {

	
	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("emp");
		//employeeDao.login();
		employeeDao.logout();
		
	}
}
