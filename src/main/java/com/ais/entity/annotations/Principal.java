package com.ais.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		annotationContext.scan("com.ais.entity.annotations");
		annotationContext.refresh();
		
		Student student = annotationContext.getBean(Student.class);
		
		StringBuilder strinbuilder = new StringBuilder();
		strinbuilder.append(student.getIdStudent());
		strinbuilder.append(" ");
		strinbuilder.append(student.getName());
		strinbuilder.append(" ");
		strinbuilder.append(student.getSurname());
		strinbuilder.append(" ");
		strinbuilder.append(student.getAge());
		System.out.println(strinbuilder.toString());
		
		
		annotationContext.close();

	}

}
