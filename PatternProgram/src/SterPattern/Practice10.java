package SterPattern;

public class Practice10 {
	public static void main(String[] args) {
		String str="abcd";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(0, i));
		}
	}

}
/*
a
ab
abc    by using methods */