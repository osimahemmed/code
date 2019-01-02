package com.sape.static1.test;

public class ChildStatic extends AStatic {
	
	static {
		
		System.out.println(" child static block 4");
	}
	
	{
		System.out.println(" child instance block 5");
	}
	
	public ChildStatic() {
		System.out.println(" child constructor 6");
	}

}
