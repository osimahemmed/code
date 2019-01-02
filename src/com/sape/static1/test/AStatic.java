package com.sape.static1.test;

public class AStatic {
	
	static {
	      System.out.println(" parent static block 1");
	   }
	   
	   {
		   System.out.println(" parent instance block 2");
	   }
	   
	   public AStatic() {
			System.out.println(" parent constructor 3");
		}
}
