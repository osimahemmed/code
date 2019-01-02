package com.test.java.program;

public class _1_SecondSmallest {

	public static void main(String[] args) {
	   int arr[] = { 5,6,1,2,3,4};
		//int arr[] = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MIN_VALUE};
	//	int arr[] = {1,1};
		print2Smallest(arr);
	}

	private static void print2Smallest(int[] arr) {
		int first = Integer.MAX_VALUE-1; 
		int second = Integer.MAX_VALUE;
		
		/*int first = 0; 
		int second = 0;*/

		if (arr.length < 2) {
			System.out.println("Invalid Size");
			return;
		}

		//first = second = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}

		//if (second == Integer.MAX_VALUE) {
			System.out.println("first =" + first);
			//System.out.println("Second do not have value");
			//System.out.println("first =" + first + "second= " + second);
			System.out.println("second= " + second);
	//	} else {
			//System.out.println("first =" + first + "second= " + second);
		//}
	}
}
