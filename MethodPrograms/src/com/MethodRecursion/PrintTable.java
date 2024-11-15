package com.MethodRecursion;

//program to print table of number using recursion
public class PrintTable {
	public static void printTable(int n, int multiplier) {
		if (multiplier > n) {
			return;
		}
		System.out.println("2 * " + multiplier + " = " + (2 * multiplier));
		printTable(n, multiplier + 1);
	}

	public static void main(String[] args) {
		int n = 10;
		printTable(n, 1);
	}
}
