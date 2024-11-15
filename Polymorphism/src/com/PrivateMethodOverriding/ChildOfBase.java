package com.PrivateMethodOverriding;

public class ChildOfBase extends Base {
	@Override
	public  void m1() {
		System.out.println("I am privete method m1 of ChildOfbase class ");

	}

	public static void main(String[] args) {
		ChildOfBase x = new ChildOfBase();
		x.m1();
	}
}
