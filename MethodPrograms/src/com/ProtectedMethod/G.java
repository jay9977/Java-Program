package com.ProtectedMethod;

public class G {
public static void main(String[] args) {
	G a= new G();
	a.m3(); // protected method are not invoke in another class by creating object of class where we invoke it and same for all private,protected ,public,default.
}
}
