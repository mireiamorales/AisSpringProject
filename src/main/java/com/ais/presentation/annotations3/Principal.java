package com.ais.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationcontext= new AnnotationConfigApplicationContext();

		annotationcontext.scan("com.ais.presentation.annotations3");
		annotationcontext.refresh();
		
		HelloWorld helloworld = annotationcontext.getBean(HelloWorld.class);
		System.out.println(helloworld.getHello());
		
		HelloWorld helloworld1 = (HelloWorld)annotationcontext.getBean("helloWorld");
		System.out.println(helloworld1.getHello());
		
		annotationcontext.close();
	}

}
