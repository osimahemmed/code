package com.test.java.program;

import java.util.HashSet;
import java.util.Set;

public class _13_FindNumberofPairFromIntegerArrayWhoseSumEqualToNumber {

	public static void main(String[] args) {
		int[] arr = { 14, 4, 7, 3, 5 ,3 };
		findPairOfSum(arr, 10);
	}

	private static void findPairOfSum(int[] arr, int sum) {
		Set<Integer> set = new HashSet<Integer>();

		for (int value : arr) {
			int diff = sum - value;
			if (set.contains(diff)) {
				System.out.println("pair of sum: " + value + " " + diff);
				set.remove(diff);
			} else {
				set.add(value);
			}
		}
	}
}
