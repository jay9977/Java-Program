package SterPattern;
import java.util.*;
public class Practice2 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("eneter the numer:");
		int x=in.nextInt();
		for (int line = x; line >=0; line--) {
			for (int astic = 1; astic <=line; astic++) {
				System.out.print("*");	
				}	
			System.out.println();
		}
		
	}

}
/*
****
***
**
*      */