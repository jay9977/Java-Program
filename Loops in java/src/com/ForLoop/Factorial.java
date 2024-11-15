package com.ForLoop;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;
		for (int i = n - 1; i > 0; i--) {
			n = n * i;

		}
		System.out.println("factorial of 5 " + " is :" + n);
	}

}
