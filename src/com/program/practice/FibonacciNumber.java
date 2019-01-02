package com.program.practice;

public class FibonacciNumber {

	public static void main(String[] args) {
		int i = fibonacciUsingRecursion(10);
		System.out.println(i);
		fibonacciUsingIteration(1);
	}

	private static int fibonacciUsingRecursion(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
	}
	
	private static int fibonacciUsingIteration(int n) {
		int a = -1;
		int b =  1;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
			//System.out.println(sum + " ");
		}
		System.out.println(sum + " ");
		return sum;
	}

}
