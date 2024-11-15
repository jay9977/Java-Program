package com.QuestionSolvingOnOneDArray;

public class SecondMaxNumInArray {
	public static void main(String[] args) {
		int[] a = { 1, 12, 3, 4, 5, 121, 19 };
		int max = 0;
		int secmax = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				secmax = max;
				max = a[i];

			} else if (secmax < a[i]) {
				secmax = a[i];

			}
		}
		System.out.println(secmax);
	}
}
