package com.StringBaseQuestion;

// reverse the word of the string without changing their orders
//e.g- " India is my" to "aidnI si ym"
public class Reverse {
	public static void main(String[] args) {
		String s = "India Is My Country";
		String[] rev = s.split(" ");
		String reverseString = "";
		for (String w : rev) {
			String reverseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";

		}
		System.out.println(reverseString);
	}

}
/***
 * by using simple for loop
 */
//package com.StringBaseQuestion;

/*
 * public class Reverse { public static void main(String[] args) { String s =
 * "India Is My Country"; String[] words = s.split(" "); String reverseString =
 * "";
 * 
 * for (int j = 0; j < words.length; j++) { String word = words[j]; String
 * reverseWord = "";
 * 
 * for (int i = word.length() - 1; i >= 0; i--) { reverseWord += word.charAt(i);
 * }
 * 
 * reverseString += reverseWord;
 * 
 * if (j < words.length - 1) { reverseString += " "; } }
 * 
 * System.out.println(reverseString); } }
 */
