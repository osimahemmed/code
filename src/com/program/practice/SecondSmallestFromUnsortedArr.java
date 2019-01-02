package com.program.practice;

public class SecondSmallestFromUnsortedArr {

	public static void main(String[] args) {
		
		int[] arr = {34, 2, 12, 1, 99, 0, 45, 20};
		//int[] arr = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MIN_VALUE};
		//int[] arr = {1,1};
		int secondSmall = getSecondSmallest(arr);
		System.out.println(secondSmall);

	}
	
	private static int getSecondSmallest(int[] arr) {
		int smallest 	   = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		if(arr.length < 2) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		for(int currElement : arr) {
			if(currElement < smallest) {
				secondSmallest = smallest;
				smallest = currElement;
			} else if (currElement < secondSmallest && currElement != smallest){
				secondSmallest = currElement;
			}
		}
		System.out.println(" smallest " +smallest + " secondSmallest  " + secondSmallest);
		return secondSmallest;
	}

}
