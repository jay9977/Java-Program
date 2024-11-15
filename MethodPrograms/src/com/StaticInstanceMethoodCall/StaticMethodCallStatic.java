package com.StaticInstanceMethoodCall;

public class StaticMethodCallStatic {

	public static void m1() {
		System.out.println("I am static method m1");
      m2();
	}
	public static void m2() {
		System.out.println("I am static method m2");

	}
	
	
	public static void main(String[] args) {
	m1();
}
}
//we can call static method in static method directly without creating object.