package com.ais.entity.listas;

public class Teacher {
	private int idTeacher;
	private String name;
	
	public int getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return (new StringBuilder())
				.append("[#")
				.append(this.idTeacher)
				.append(", ")
				.append(this.name)
				.append("]")
				.toString();
	}
	
	
}
