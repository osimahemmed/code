package com.sort;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] array = { 10, 34, 2, 5, 3, 6, 1 };
		mergeSort(array, 0, 6);
		for (int i : array) {
			System.out.println(i);
		}

	}
	
	public static void mergeSort(int[] array, int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);
		}

	}

	private static void merge(int[] array, int low, int mid, int high) {
		int size = high - low + 1;
		int[] temp = new int[size];
		int currentLow = low;
		int currentHigh = mid + 1;
		int current = 0;

		while ((currentLow <= mid) && (currentHigh <= high)) {
			if (array[currentLow] < array[currentHigh]) {
				temp[current] = array[currentLow];
				currentLow++;
			} else {
				temp[current] = array[currentHigh];
				currentHigh++;
			}
			current++;
		}

		while (currentLow <= mid) {
			
			temp[current] = array[currentLow];
			current++;
			currentLow++;
		}

		for (int i = 0; i < current; i++) {
			array[low] = temp[i];
			low++;
		}

	}

}
