package com.order;

public class OrderOfExecution {
	// constructor
	OrderOfExecution() {
		System.out.println("constructor");

	}

	// Instance block
	{
		System.out.println("instance block");
	}

	// Instance method
	void j1() {
		System.out.println("instance method");
	}

//static method
	static void jaydeep() {
		System.out.println("static method");

	}

//static block
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		jaydeep();
		new OrderOfExecution().j1();

	}
}
