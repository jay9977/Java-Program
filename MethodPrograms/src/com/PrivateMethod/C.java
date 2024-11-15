package com.PrivateMethod;
import com.PublicMethod.A;
import com.ProtectedMethod.*;

public class C extends E{
   private void m2() {
	System.out.println("I am method m1 in class c of package PrivateMethod");
}
   public static void main(String[] args) {
	C y=new C();
	y.m2();//private method access in same class
	A x=new A();
	x.m1();//here public method m1 invoke in C class which is in PrivateMethod Package by creating object of A class which is present in another package.
	C e= new C(); 
	e.m3();//here the protected method m3 which is in ProtectedMethod package invoke in class C by creating object of C which is present in another package using Inheritance only
	/*E z=new E();
	z.m3(); here the protected method can't invoke in another package class by creating object of 
	class where protected method created .  */
}
}
