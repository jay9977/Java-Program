package com.ProtectedMethod;

public class F {
public static void main(String[] args) {
	E r= new E();
	r.m3();//protected method invoke in another class of same package by creating object of class where the method is created.
}
}
