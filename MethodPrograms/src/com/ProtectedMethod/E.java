package com.ProtectedMethod;

public class E {
	protected void m3() {
		System.out.println("I am Protected method m3 in class E of Protected package");

	}
	public static void main(String[] args) {
		E a=new E();
		a.m3();//protected method invoke in same class
	}

}
