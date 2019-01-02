package com.test.java.program;

public class _19_ATOI {

	public static void main(String[] args) {
		int numericValue = atoi(49);
		System.out.println("In main = " + numericValue);
	}

	public static int atoi(int asciiValue) {
		int numericValue = -1;
		if (asciiValue >= '0' && asciiValue <= '9') {
			numericValue = asciiValue - '0';
		}
		
		System.out.println((char)asciiValue);
		return numericValue;
	}
}
