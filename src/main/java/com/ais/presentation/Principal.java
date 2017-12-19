package com.ais.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");

		HelloWorld helloworld  =(HelloWorld)context.getBean("helloWorld");
		
		System.out.println(helloworld.getHello());
		
		
		HelloWorld hellorWolrdConst = (HelloWorld)context.getBean("helloWorldConst");
		
		System.out.println(hellorWolrdConst.getHello());
		
		context.close();
	}

}
