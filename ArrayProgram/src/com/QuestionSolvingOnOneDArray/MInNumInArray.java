package com.QuestionSolvingOnOneDArray;

public class MInNumInArray {
	public static void main(String[] args) {
		int a[] = { 3, 2, 4, 5, 6, 7, 88 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
