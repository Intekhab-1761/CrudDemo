package com.tns.springci;

public class Person {

	String name;
	int id;
	Certificate certi;
	
	public Person(String name,int id,Certificate certi) {
		this.name=name;
		this.id=id;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + "]";
	}

	

	
}
