package com.ais.builderexample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Employee emp = (Employee) context.getBean("employee");
		System.out.println(emp);
		context.close();
	}

}
