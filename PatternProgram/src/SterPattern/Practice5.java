package SterPattern;
import java.util.*;
public class Practice5 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the numer:");
	int x=in.nextInt();
	for (int line = 1; line <=x; line++) {
		for (int space = 1; space <=x-line; space++) {
			System.out.print(" ");
		}
		for (int astic = 0; astic < line; astic++) {
			System.out.print("*"+" ");
			
		}
		System.out.println();
		
	}
}
}
/*
    *
   * *
  * * *
 * * * *
* * * * *      */