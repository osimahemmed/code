package com.osim.spring;

public class B {

	private A a;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*public B() {}
	public B (A a,int age) {
		this.a = a;
		this.age = age;
	}*/
	public void show() {
		
		System.out.println("age :: " +age);
	}

	public void setA(A a) {
		this.a = a;
	}

	public A getA() {
		return a;
	}
}
