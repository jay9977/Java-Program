package com.StringClassMethods;

public class Str {
	public static void main(String[] args) {
		String s = new String("hello");
		String y = new String("hello");
		String w = "Hello World";
		w.concat("Jaydeep");//can't concat because string is immutable
		w=w.concat(" Testing Shastra");
//here the == operator comparing the address of non primitive data type
		if (s == y) {
			System.out.println("string is equal");
		} else {
			System.out.println("String is not equal");
		}
		System.out.println(w);
	}
}
