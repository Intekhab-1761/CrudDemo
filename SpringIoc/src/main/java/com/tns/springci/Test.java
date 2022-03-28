package com.tns.springci;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {

	AbstractApplicationContext c=new ClassPathXmlApplicationContext("com/tns/springci/cibeans.xml");
	Person p=(Person)c.getBean("person");
	System.out.println(p);
	c.registerShutdownHook();
	c.close();
	}
}
