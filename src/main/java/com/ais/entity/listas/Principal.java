package com.ais.entity.listas;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		AbstractApplicationContext context= 
				new ClassPathXmlApplicationContext("spring-config.xml");

		Student estudiante = (Student)context.getBean("davidStudent");	
		System.out.println(estudiante.toString());
		
		context.close();
	}
}
