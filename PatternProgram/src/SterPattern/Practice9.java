package SterPattern;

public class Practice9 {
	public static void main(String[] args) {
		
		 for (int i = 1; i <= 4; i++) {
	            // Inner loop to print characters on each line
	            for (char ch = 'a'; ch < 'a' + i; ch++) {
	                System.out.print(ch + " ");
	            }
	            // Move to the next line after printing characters
	            System.out.println();
	        }
	}

}
/*
a
a b
a b c
a b c d
         by without using method */