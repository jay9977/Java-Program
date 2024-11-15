package com.MethodRecursion;
//program to print 1 to 5 number by using recursion and not use loop.

public class PrintNum1To5 {
	public static void printNum(int x) {
		if (x == 6) {
			return;
		}
		System.out.println(x);
		printNum(x + 1);

	}

	public static void main(String[] args) {
		int startingNum = 1;
		printNum(startingNum);
	}
}
