package com.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Aspect
@Aspect
@Component
public class EmployeeDaoAdvice {

	// @Before("execution(* com.dao.EmployeeDao.login())")
	@After("execution(* com.dao.EmployeeDao.login())")
	public void loginAdvice() {

		System.out.println("before login advice");
	}

	@Around("execution(* com.dao.EmployeeDao.logout())")
	public void logoutAdvice(ProceedingJoinPoint jp) {

		System.out.println("before logout");
		
		// jp
		
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("after logout");

	}

}
