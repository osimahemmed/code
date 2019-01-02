package com.osim.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String args[]) {
		//Traingle triangle = new Traingle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/*Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();*/
		/*B  obj = (B)context.getBean("b");
		obj.show();*/
		
		Singleton singleton1 = (Singleton)context.getBean("singleton");
		singleton1.setName("osim");
		singleton1.getName();
		
		Singleton singleton2 = (Singleton)context.getBean("singleton");
		singleton2.getName();
		
	}
}