package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Airtel airtel=(Airtel) c.getBean("airtel");
		airtel.calling();
		airtel.data();
	
		System.out.println(airtel.getName());
		System.out.println(airtel.getAddress());
		System.out.println(airtel.getPhones());
		System.out.println(airtel.getPlans());
	}

}
