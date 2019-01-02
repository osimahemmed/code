package com.test.java.program;

public class _28_DotProductCrossProduct {

	public static void main(String[] args) {
		//dotProduct();
		crossProduct();
	}

	private static void dotProduct() {
		int[] a = { 1, 2, 2, 1 };
		int[] b = { 1, 2, 2, 1 };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] + b[i];

		}
		System.out.println("Dot product is: " + sum);
	}

	private static void crossProduct() {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] b = { { 1, 4 }, { 2, 5 }, { 3, 6 } };

		int noOfRowsFirstMatrix = a.length;
		int noOfColFirstMatrix = a[0].length;
		int noOfRowsSecondMatrix = b.length;
		int noOfColSecondMatrix = b[0].length;

		if (noOfColFirstMatrix != noOfRowsSecondMatrix)
			System.out.println("Illegal matrix dimensions.");

		int[][] c = new int[noOfRowsFirstMatrix][noOfColSecondMatrix];

		for (int i = 0; i < noOfRowsFirstMatrix; i++) {
			for (int j = 0; j < noOfColSecondMatrix; j++) {
				for (int k = 0; k < noOfColFirstMatrix; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("\n");
			for (int j = 0; j < c[0].length; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
