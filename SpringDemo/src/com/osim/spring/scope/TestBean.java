package com.osim.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		A a = context.getBean("a", A.class);
		
		System.out.println("a before " + a.getText());
		System.out.println("b before " + a.getB().getText());
		a.setText("text A1");
		a.getB().setText("text B1");
		
		a = context.getBean("a",A.class);

		System.out.println("a after " + a.getText());
		System.out.println("b after " + a.getB().getText());
	}

}
