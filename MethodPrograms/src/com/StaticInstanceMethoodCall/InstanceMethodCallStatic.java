package com.StaticInstanceMethoodCall;

public class InstanceMethodCallStatic {
    
	public static void m1() {
		System.out.println("I am static method m1");
	}
	public void m2() {
		m1();
		System.err.println("I am instance method m2" );
	}
	
	
	public static void main(String[] args) {
		new InstanceMethodCallStatic().m2();
		
	}
     
}//to call static method from instance we have to create object of instance.
