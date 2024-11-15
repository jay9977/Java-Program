package com.AbstractMethodQuestion;

public class Child2 extends Child1 {

	@Override
	void m6() {
		System.out.println(
				"abstract method m6 in class Test which is also extend in Child class Child 1 override in child concret class child2 ");

	}

	@Override
	void m7() {
		System.out.println(
				"abstract method m7 in class Test which is also extend in Child class Child 1 override in child concret class child2 ");

	}

	@Override
	void m8() {
		System.out.println(
				"abstract method m8 in class Test which is also extend in Child class Child 1 override in child concret class child2 ");

	}

	@Override
	void m9() {
		System.out.println(
				"abstract method m9 in class Test which is also extend in Child class Child 1 override in child concret class child2 ");

	}

	@Override
	void m10() {
		System.out.println(
				"abstract method m10 in class Test which is also extend in Child class Child 1 override in child concret class child2 ");

	}

	public static void main(String[] args) {
		Child1 x = new Child2();
		x.m1();
		x.m2();
		x.m3();
		x.m4();
		x.m5();
		x.m6();
		x.m7();
		x.m8();
		x.m9();
		x.m10();

	}

}
