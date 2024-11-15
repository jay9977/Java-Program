package com.MethodRecursion;

//print fibonachi series without using loop.
public class FibonachiSeries {

	public static void printFibo(int a, int b, int c) {
		if (c == 0) {
			return;
		}
		int n = a + b;
		System.out.println(n);
		printFibo(b, n, c - 1);

	}

	public static void main(String[] args) {
		int a = 0, b = 1, c = 10;
		System.out.println(a);
		System.out.println(b);
		printFibo(a, b, c);
	}
}
