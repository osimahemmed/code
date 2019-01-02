// https://ideone.com/XzJXLv
// https://stackoverflow.com/questions/21665940/determining-square-root-using-newtons-method
// https://www.geeksforgeeks.org/program-for-newton-raphson-method/

package com.test.java.program;

public class _24_NewtonRaphsonSquareRoot {

	public static void main(String[] args) {
		float a = (float) 123.45;
		
		float c = compute(a);
		System.out.println("c = " + c);
		
		float c1 = squareRoot(a);
		System.out.println("c1 = " + c1);
	}

	
	public static float squareRoot(float number) {
		float temp = 1;
		while (true) {
			float result = temp - (temp * temp - number) / (2 * temp);
			float val = Math.abs(temp - result);
			if (val < 0.0001) {
				return result;
			} else
				temp = result;
		}

	}

	
	public static float compute(float number) {
		float temp = number / 2;

		while (true) {
			float sqrRoot = temp - (temp * temp - number) / (2 * temp);
			float value = Math.abs(temp - sqrRoot);

			if (value < 0.0001)
				return sqrRoot;
			else
				temp = sqrRoot;
		}
	}
	
}
