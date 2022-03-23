package com.tns.springci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {

	ApplicationContext c=new ClassPathXmlApplicationContext("com/tns/springci/cibeans.xml");
	Person p=(Person)c.getBean("person");
	System.out.println(p);
	}
}
