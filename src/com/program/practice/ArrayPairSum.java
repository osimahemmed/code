package com.program.practice;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSum {
	
	public static void main(String[] args) {        

	    int []a = {2,45,7,3,5,1,8,9};
	    printSumPairs(a,10);
	    printSumPairsAp2(a,10);

	}


	private static void printSumPairsAp2(int[] a, int m) {
		
		int left = 0;
		int right = a.length-1;
		while(left < right) {
			int sum = 0;
			sum = a[left] + a[right];
			if(sum == m) {
				System.out.println("pair is " + a[left] + " , " + a[right]);
				break;
			}
			else if(sum > m) {
				right --;
			} else {
				left ++;
			}
			
		}
	}


	public static void printSumPairs(int []input, int k) {
	    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

	    for(int i = 0; i < input.length; i++) {
	    	if(pairs.containsKey(input[i]))
	    		System.out.println(input[i] +  " , " + pairs.get(input[i]));
	    	else 
	    		pairs.put(k-input[i], input[i]);
	    }
	    
	    /*for(int i = 0;i < input.length; i++){

	        if(pairs.containsKey(input[i]))
	            System.out.println(input[i] +", "+ pairs.get(input[i]));
	        else
	            pairs.put(k-input[i], input[i]);
	    }*/

	}

}
