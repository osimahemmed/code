
//32) snow pack problem example
package com.program.practice;

public class SnowPackProblem {
	
	static int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

	public static void main(String[] args) {
		System.out.println("Maximum water that can be accumulated is " + 
                findWater(arr));

	}

	static int findWater(int[] arr) {
		int n = arr.length;
		int left[]  = new int[n];
		int right[] = new int[n];

		// left[i] contains height of tallest bar to the left of i'th bar including
		// itself
		// Fill left array
		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = Math.max(left[i - 1], arr[i]);

		// Right [i] contains height of tallest bar to the right of ith bar including
		// itself
		// Fill right array
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		// Calculate the accumulated water element by element consider the amount of
		// water on i'th bar, the amount of water accumulated on this particular bar
		// will be equal to min(left[i], right[i]) - arr[i] .
		int water = 0;
		for (int i = 0; i < n; i++)
			water += Math.min(left[i], right[i]) - arr[i];

		return water;
	}

}
