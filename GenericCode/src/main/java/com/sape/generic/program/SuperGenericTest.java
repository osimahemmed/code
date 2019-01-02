package com.sape.generic.program;

import java.util.ArrayList;
import java.util.List;



public class SuperGenericTest {

	public static void main(String[] args) {
		
		List<D> listD = new ArrayList<>();
		List<C> listC = new ArrayList<>();
		List<B> listB = new ArrayList<>();
		
		//List<A> listA = listD;
		List<? extends A> list1 = listD;
		
		/*List<? extends B> list = new ArrayList<B>();
		list.add(new C());*/

	}
	
	static class A {} 
	
	static class B extends A {}
	static class C extends B {}
	static class D extends C {}

}
