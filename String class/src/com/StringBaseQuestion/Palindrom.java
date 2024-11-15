package com.StringBaseQuestion;

public class Palindrom {
	public static void main(String[] args) {
		String s = "aabbaa";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		if (s.equals(rev)) {
			System.out.println(s + " is palindrome");
		} else
			System.out.println(s + " is not palindrome");
	}
}
