package com.test.java.program;

public class _17_Fibonacci {

	public static void main(String[] args) {
		//fibonacciUsingIteration(9);
		//fibonacciSeriesIteration(9);
		fiboNacci(10);
		System.out.println();
		int n = fibonacciUsingRecursion(9);
		System.out.println();
		System.out.println(n);
	}

	public static int fibonacciUsingRecursion(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciUsingRecursion(n - 1) + fibonacciUsingRecursion(n - 2);
	}
	public static int fibonacciUsingIteration(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		System.out.println(sum);
		return sum;
	}
	
	public static int fibonacciSeriesIteration(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a + " " + b);
		for (int i = 0; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(" " + sum);
		}
		return sum;
	}
	
	private static void fiboNacci(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.print(a + " " + b);
		for(int i = 2; i <= n; i++) {
			sum = a+b;
			a = b;
			b = sum;
			System.out.print(" " + sum);
		}
	}
}
