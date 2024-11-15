package com.MethodRecursion;

//program to print hello 10 times without using loop.

public class PrintHello {
	static int count = 1; // here we take static variable which has only one copy in memory and can
							// change.

	public void m1() {
		System.out.println("Hello");
		if (count < 10) {
			count++;
			m1();

		}

	}

	public static void main(String[] args) {
		new PrintHello().m1(); // this is also type of object creation
		/*
		 * Practice a= new Practice(); a.m1();
		 */
	}
}
