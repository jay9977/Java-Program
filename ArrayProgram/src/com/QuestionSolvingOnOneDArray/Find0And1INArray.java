package com.QuestionSolvingOnOneDArray;

//find 0 and 1 in array
public class Find0And1INArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 0, 3, 1, 5, 0 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				System.out.println("1 is found at index:" + i);
			} else if (a[i] == 0) {
				System.out.println("0 is found at index:" + i);
			}

		}
	}
}
