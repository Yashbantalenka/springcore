package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/collection/config_collection.xml");
		Emp emp = (Emp) context.getBean("collection");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
	}
}
