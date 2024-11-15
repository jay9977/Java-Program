package com.MethodRecursion;
//print number 5 to 0 by using recursion and not loop.

public class PrintNum5To0 {
	public static void count(int x) {
		if (x == 0) {
			return;
		}
		System.out.println(x);
		count(x - 1);

	}

	public static void main(String[] args) {
		int n = 5;
		count(n);
	}
}
