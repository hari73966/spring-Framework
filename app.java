package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class app {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        student student1=(student) context.getBean("student1");
        System.out.println(student1);
	}

}
