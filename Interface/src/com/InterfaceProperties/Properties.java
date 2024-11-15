package com.InterfaceProperties;

// this is class who has only need of abstract method
public class Properties implements Inter {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub

	}
	// now this class has choice whether implement new feature means new method m4
	// or not to override it or not

	public static void main(String[] args) {
		System.out.println(Inter.i);// call public static final variable in interface
		Properties x = new Properties();
		x.m4();// default method call
		Inter.m5();// static method call
	}

}
