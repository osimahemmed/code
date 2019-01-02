
//Check if a number is a power of another number
package com.program.practice;

public class CheckNumPowerOfAnotherNum {
	
	private static final double CONS = 0.000001;

	public static void main(String[] args) {
		// Check if x is a power of y
		double x = 0.1;
		int y = 10;
		System.out.println(+ x + " is power of " + y + ": " + isPower(x, y));
	}

	private static boolean isPower(final double x, final int y) {
		double n = y;
		if (x == 1)
			return true;

		else if (x < 1) {
			while (n > x)
				n /= y;
		} else {
			while (n < x)
				n *= y;
		}
		//return n == x;
		return Math.abs(n-x) < CONS;//
	}

}
