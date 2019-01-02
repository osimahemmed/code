package com.test.java.program;

public class _20_Armstrong {

	public static void main(String[] args) {
		boolean a = isArmstrong(153);
		boolean ar = isArmstrongNum(153);
		System.out.println(a);
		System.out.println(ar);
	}

	private static boolean isArmstrong(int input) {
		int length = String.valueOf(input).length();
		//System.out.println("lenght = " + length);
		int sum = 0;
		int num = input;
		while (num > 0) {
			int remainder  = num % 10;
			sum = (int) (sum + Math.pow(remainder , length));
			num = num / 10;
		}
		return (input == sum);
	}
	
	private static boolean isArmstrongNum(int input) {
		int arms = input;
		int sum = 0 ;
		while(arms > 0) {
			int rem = arms % 10;
			sum = sum + rem*rem*rem;
			arms = arms/10;
		}
		return input == sum;
	}
}
