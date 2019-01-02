package com.test.java.program;

public class _15_X_isPowerOf_Y {

	public static void main(String[] args) {
		int x = 10;
		int y = 1000;
		System.out.println(+x + " is power of " + y + ": " + isPower(x, y));

	}

	public static boolean isPower(int x, int y) {
		// The only power of 1 is 1 itself
		if (x == 1)
			return (y == 1);

		// Repeatedly compute power of x
		int pow = 1;
		while (pow < y)
			pow = pow * x;

		// Check if power of x becomes y
		return (pow == y);
	}
}
