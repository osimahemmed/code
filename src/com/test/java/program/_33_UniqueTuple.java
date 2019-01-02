package com.test.java.program;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _33_UniqueTuple {

	public static void main(String[] args) {
		String input = "abcde";
		 getUniqueTuple(input,2);
		 getUniqueTupleCyclic(input, 6);
	}

	private static Set<String> getUniqueTuple(String input, int len) {
		Set<String> set = new LinkedHashSet<>();
		String temp = input;
		for (int i = 0; i <= input.length() - len ; i++) {
			set.add(temp.substring(i, i + len));
		}
		System.out.println(set);
		return set;
	}
	
	private static List<String> getUniqueTupleCyclic(String input, int len) {
		List<String> set = new ArrayList<>();
		String temp = input + input;
		for (int i = 0; i < input.length(); i++) {
			set.add(temp.substring(i, i + len));
		}
		System.out.println(set);
		return set;
	}
}
