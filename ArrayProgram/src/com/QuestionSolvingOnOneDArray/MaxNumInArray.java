package com.QuestionSolvingOnOneDArray;

// find max number in array
public class MaxNumInArray {
	public static void main(String[] args) {
		int[] j = { 1, 2, 3, 4, 6, 7, 9, 12, 10 };
		int max = j[0];
		for (int i = 0; i < j.length; i++) {
			if (max < j[i]) {
				max = j[i];
			}

		}
		System.out.println(max);

	}
}
