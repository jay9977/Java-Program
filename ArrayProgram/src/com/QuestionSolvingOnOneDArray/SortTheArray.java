package com.QuestionSolvingOnOneDArray;

public class SortTheArray {
	public static void main(String[] args) {
		int[] array = { 5, 2, 8, 3, 1 };

		// Bubble sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					// Swap array[j] and array[j + 1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		// Print sorted array
		System.out.println("Sorted array:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
