package com.test.java.program;

public class _22_PowerOfTen_10 {

	private static final int ONE = 1;
	public static void main(String[] args) {
		

		double x = 0.1;
		int y = 10;
		
		//System.out.println("1000: " + isPowerOfTen(1000, 10));
		System.out.println("4: " + isPowerOfTen(4, 10));
		/*System.out.println("0: " + isPowerOfTen(0, 10));
		System.out.println("100: " + isPowerOfTen(100, 10));
		System.out.println("40: " + isPowerOfTen(40, 10));
		System.out.println("0.1: " + isPowerOfTen(0.1, 10));*/
	}

	private static boolean isPowerOfTen(final double value, final double pow) {
		double power1 = pow;
		if (value == ONE)
			return true;

		else if (value < ONE) {
			while (power1 > value)		
				power1 = power1 / pow;
		} 
		else {
			while (power1 < value)	
				power1 = power1 * pow;
		}
		return power1 == value;
	}
	
	private static boolean isPowerTen(final double value, final double pow) {//pow = 10
		double power1 = pow;
		if(value == 1) {
			return true;
		}
		else if(value < 1) {
			while(power1 > value) {
				power1 = power1 / pow;
			}
		} else {
			while(power1 < value) {
				power1 = power1*pow;
			}
		}
		return power1 == value;
		
	}
}
