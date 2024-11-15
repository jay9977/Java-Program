package com.StaticInstanceMethoodCall;

public class StaticMethodCallInstance {

	public static void m1() {
	System.out.println("I am static method m1");
	 // m2();  we can't call like that beacuse m2 is instance method
	 StaticMethodCallInstance x= new  StaticMethodCallInstance();
	 x.m2();
	}
	public void m2() {
		System.out.println("I am instance method m2");
	}
	
	public static void main(String[] args) {
	m1(); //we can call these direct without creating object beacuse it is static 
}
}
