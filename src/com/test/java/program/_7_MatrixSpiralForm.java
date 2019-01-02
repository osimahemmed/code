package com.test.java.program;

public class _7_MatrixSpiralForm {

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3, 4, 5, 6 },
						{ 7, 8, 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16, 17, 18 } 
					  };
		
		int arr[][] = {{1,2,3},
				 	   {4,5,6},
				 	   {7,8,9}
				 	  };
		
		int i;
		int noOfRows = arr.length;
		int noOfCols = arr[0].length;

		int currentRow = 0;
		int currentColumn = 0;

		while (currentRow < noOfRows && currentColumn < noOfCols) {
			// Print the first row
			for (i = currentColumn; i < noOfCols; i++) {
				System.out.print(arr[currentRow][i] + " ");
			}
			currentRow++;

			// Print the last column
			for (i = currentRow; i < noOfRows; i++) {
				System.out.print(arr[i][noOfCols - 1] + " ");
			}
			noOfCols--;
			
				 /*{{1,2,3},
			 	   {4,5,6},
			 	   {7,8,9}
			 	 }*/

			// Print the last row from the remaining rows 
			//if (currentRow < noOfRows) {
				for (i = noOfCols - 1; i >= currentColumn; i--) {
					System.out.print(arr[noOfRows - 1][i] + " ");
				}
				noOfRows--;
			//}

			// Print the first column from the remaining columns 
			//if (currentColumn < noOfCols) {
				for (i = noOfRows - 1; i >= currentRow; i--) {
					System.out.print(arr[i][currentColumn] + " ");
				}
				currentColumn++;
			//}
		}
	}

}
