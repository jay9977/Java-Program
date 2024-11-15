package com.instanceVariable;

public class InstanceCall {
	// instance variable are call by public instance method of another class
	public void m1() {
		Instance y = new Instance();
		System.out.println(y.x);
	}

	// instance variable are call by private instance method of another class
	private void m2() {
		Instance z = new Instance();
		System.out.println(z.x);

	}

	// instance variable are call by public static method of another class
	public static void m3() {
		Instance m = new Instance();
		System.out.println(m.x);

	}

	// instance variable call by private static method of another class
	private static void m4() {
		Instance s = new Instance();
		System.out.println(s.x);

	}

	public static void main(String[] args) {
		InstanceCall x = new InstanceCall();
		x.m1();
		x.m2();
		m3();
		m4();

	}
}
