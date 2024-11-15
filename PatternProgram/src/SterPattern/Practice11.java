package SterPattern;

public class Practice11 {
public static void main(String[] args) {
	String str="1234";
	String num="abcd";
	for (int i = 0; i <= str.length(); i++) {
		if(i % 2==0) {
			System.out.println(num.substring(0, i));
		}
		else {
			System.out.println(str.substring(0, i));
		}
	}
}
}
/*
1
ab
123
abcd   */