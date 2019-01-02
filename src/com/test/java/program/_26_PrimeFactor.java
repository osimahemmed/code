package com.test.java.program;

public class _26_PrimeFactor {

	public static void main(String[] args) {
		primeFector(63);//21
	}

	public static void primeFector(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n = n / 2;
		}

		for (int i = 3; i <= n; i = i + 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
	}
}
