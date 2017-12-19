package com.ais.entity;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Principal {

	public static void main(String[] args) throws IOException {
				
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring-config.xml");

		Student estudiante = (Student)context.getBean("student");
				
		System.out.println(estudiante.getIdStudent());
		System.out.println(estudiante.getName());
		System.out.println(estudiante.getSurname());
		System.out.println(estudiante.getAge());
		
		Address direccionEstudiante = estudiante.getAddress();
		
		System.out.println(direccionEstudiante.getIdAddress());
		System.out.println(direccionEstudiante.getStreet());
		
		
		Address direccion = (Address)context.getBean("address");
		
		System.out.println(direccion.getIdAddress());
		System.out.println(direccion.getStreet());
		
		
		Student estudianteConstructor = (Student)context.getBean("studentConst");
		
		System.out.println(estudianteConstructor.getIdStudent());
		System.out.println(estudianteConstructor.getName());
		System.out.println(estudianteConstructor.getSurname());
		System.out.println(estudianteConstructor.getAge());
		
		context.close();
		
	}

}
