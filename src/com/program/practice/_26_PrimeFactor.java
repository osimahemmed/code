///prime factorization example :- if no. is 12 prime factor [2,2,3]

package com.program.practice;

public class _26_PrimeFactor {

	public static void main(String[] args) {
		int n = 5;//63
		primeFactor(n);

	}

	static void primeFactor(int n) {

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
	
	static void primefac(int n) {
		while(n % 2 == 0) {
			System.out.println(2 + " ");
			n = n / 2;
		}
		for(int i = 3; i <= n ; i = i+2) {
			while(n % i == 0) {
				System.out.println(i+ " ");
				n  = n / i;
			}
		}
	}
}
