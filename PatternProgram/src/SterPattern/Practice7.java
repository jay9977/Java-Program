package SterPattern;
import java.util.*;
public class Practice7 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int x=in.nextInt();
		for (int line = 1; line <=x; line++) {
			for (int space = 1; space <line ; space++) {
				System.out.print(" ");
			}
			for (int astic = x; astic >=0; astic--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
*****
 *****
  *****
   *****
    *****     */