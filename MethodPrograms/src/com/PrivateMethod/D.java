package com.PrivateMethod;

import com.PublicMethod.A;

public class D {
	public static void main(String[] args) {
		C a= new C();
		a.m2();// m2 can't access beacuse it is private method
		A c=new A();
		c.m1();//m1 can access beacuse it is public method.
	}

}
