package com.MethodRecursion;

//find factorial of given number by using recursion.
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Fact {
	// Recursive method to find the factorial of a number
	public static int factorial(int n) {
		if (n == 0) {
			return 1; // Base case: factorial of 0 is 1
		} else {
			return n * factorial(n - 1); // Recursive case
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the number whos factor you want:");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = factorial(number);
		System.out.println("The factorial of " + number + " is " + result);
	}
}
