package com.StringClassMethods;

public class StrMethods {
	public static void main(String[] args) {
		String s = "Hellow World";
		String t = new String("Hellow World");
		// concat method
		System.out.println(s.concat(" rahul"));
		// toUppercase
		System.out.println(s.toUpperCase());
		// toLowercase
		System.out.println(s.toLowerCase());
		// charAt
		System.out.println(s.charAt(4));
		// indexOf char
		System.out.println(s.indexOf('l'));
		// indexOf String
		System.out.println(s.indexOf("Hello"));
		// subString
		System.out.println(s.substring(2, 7));
		// endsWith
		System.out.println(s.endsWith("d"));
		// StarsWith
		System.out.println(s.startsWith("w"));
		// getByte
		System.out.println(s.getBytes());
		// trim it removes any space from string
		System.out.println(s.trim());
		// equals
		System.out.println(s.equals(t));
		// equalIgnoecase
		System.out.println(s.equalsIgnoreCase(t));
		// compairTo this method return 0 if both string are eql return <0 if first str
		// is smaller then second and returns 0> wise versa
		System.out.println(s.compareTo(t));
		// length
		System.out.println(s.length());
		// is empty
		System.out.println(s.isEmpty());

	}

}
