package com.QuestionSolvingOnOneDArray;

import java.util.Iterator;

public class OccurenceOfElement {
	public static void main(String[] args) {
		int[] a = { 12, 3, 4, 5, 6, 12, 345, 12 };
		int count = 0;
		int value = 12;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				count++;

			}
			System.out.println("occurence of" + value + ":" + count);

		}
	}
}
