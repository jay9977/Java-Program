package com.PublicMethod;
import com.DefaultMethod.*;
public class A extends Def {
	// instance method
	public void m1() {
		System.out.println("I am public method m1 in class A of package PublicMethod");

	}

	public static void main(String[] args) {
		A x = new A();
		x.m1(); // public method can access anywhere means in any package,class etc.
	/* Def s= new Def();
		s.k();  here the defautl method can't invoke in class of another package  */
	/*	A s= new A();
		s.k(); default method cant invoke by using inheritance also in another pacakge */
		}

}
