//Print matrix in spiral form e.g. {{1,2,3},{4,5,6},{7,8,9}} Output . 1,2,3,6,9,8,7,4,5

package com.program.practice;

public class PrintMatrixInSpiralForm {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5, 6 },
						{ 7, 8, 9, 10, 11, 12 },
						{ 13, 14, 15, 16, 17, 18 } };
		int i;
		int noOfRows = arr.length;
		int noOfCols = arr[0].length;
		
		System.out.println(" noOfRows " + noOfRows + " and noOfCols "+ noOfCols);

		int rowPtr = 0;
		int colPtr = 0;

		while (rowPtr < noOfRows && colPtr < noOfCols) {
			// Print the first row
			for (i = colPtr; i < noOfCols; i++) {
				System.out.print(arr[rowPtr][i] + " ");
			}
			rowPtr++;

			// Print the last column
			for (i = rowPtr; i < noOfRows; i++) {
				System.out.print(arr[i][noOfCols - 1] + " ");
			}
			noOfCols--;

			// Print the last row from the remaining rows */
			if (rowPtr < noOfRows) {
				for (i = noOfCols - 1; i >= colPtr; i--) {
					System.out.print(arr[noOfRows - 1][i] + " ");
				}
				noOfRows--;
			}

			// Print the first column from the remaining columns */
			if (colPtr < noOfCols) {
				for (i = noOfRows - 1; i >= rowPtr; i--) {
					System.out.print(arr[i][colPtr] + " ");
				}
				colPtr++;
			}
		}
	}

}
