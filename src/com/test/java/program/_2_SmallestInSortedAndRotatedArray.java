package com.test.java.program;

public class _2_SmallestInSortedAndRotatedArray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 2, 3, 4, 5 };
		print2Smallest(arr);
		getSecondSmallest(arr);
	}

	private static void print2Smallest(int[] arr) {

		if (arr.length < 2) {
			System.out.println("Invalid Array");
			return;
		}
		int i = 0;
		for (i = 0; i < arr.length; i++) {

			if (arr[i + 1] < arr[i]) {
				break;
			}
		}

		System.out.println("First Smallest is value is " + arr[i + 1]);
		System.out.println("Second Smallest is value is " + arr[i + 2]);

	}
	
	private static int getSecondSmallest(int[] input) {
		int index = Integer.MIN_VALUE;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[i + 1]) {
				index = i + 2;
				break;
			}
		}
		if (index == Integer.MIN_VALUE) {
			index = 1;
		} else if (index >= input.length) {
			index = 0;
		}
		System.out.println("Second Smalest is = " + input[index]);
		return input[index];
	}
}
