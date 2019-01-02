package com.test.java.program;

import java.util.Arrays;

public class _23_LengthOfMinimumSubArrayExceedingSum {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		minimumSubArrayLengthSorted(arr,6);
	}
	
	private static int minimumSubArrayLengthSorted(int[] arr, int sumToCheck) {
		Arrays.sort(arr);

		int count = 0;
		int sum = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += arr[i];
			count++;
			if (sum > sumToCheck) {
				System.out.println("count = " + count);
				return count;
			}
		}
		return -1;
	}


}
