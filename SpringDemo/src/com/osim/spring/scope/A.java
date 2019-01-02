package com.osim.spring.scope;

public class A {

	private String text;
	//private B b;
	
	/*public void setB(B b) {
		this.b = b;
	}*/
	
	/*public B getB() {
		return b;
	}*/
	public B getB() {
		return null;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
