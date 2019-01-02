package com.test.java.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _12_ArrangeNumbersToFormBiggestNumber {

	public static void main(String[] args) {
		int[] input = {1, 34, 3, 98, 9, 76, 45, 4};
		getBiggestNumber(input);	
	}

	private static String getBiggestNumber(int[] input) {
		ArrayList<String> list = new ArrayList<>();
		String number = "";
		for (int num : input) {
			list.add(String.valueOf(num));
		}
		
		Collections.sort(list, new NumberComparator());

		for (String str : list) {
			number = number+str;
		}
		System.out.println(number);
		return number;
	}

}

class NumberComparator implements Comparator<String> {
	@Override //1, 34, 3, 98, 9, 76, 45, 4
	public int compare(String i1, String i2) {
		String orig = i1 + "" + i2;
		String reverse = i2 + "" + i1;
		return reverse.compareTo(orig);
	}
}
