package com.staticVariable;

public class Static {
	static int x = 11;// static variable
	// static variable can call by instance method

	public void m1() {
		System.out.println(x);
	}

	// static variable can call by static method
	public static void m2() {
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println(x);// static variable print without crating object
		Static a = new Static();
		Static b = new Static();
		b.x = b.x + 5;
		System.out.println(b.x);
		System.out.println(a.x);// static variable are also load by creating object
		a.m1();

	}

}
//it written at class level
//it has only one copy in the memory
//it is saved in metaspace
//all object access the same copy.
// it loades when class loads.
//static variable calls in another class write the class name beafor the variable.