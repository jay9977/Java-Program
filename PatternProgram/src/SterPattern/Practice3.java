package SterPattern;
import java.util.*;
public class Practice3 {
             public static void main(String[] args) {
				Scanner in=new Scanner(System.in);
				System.out.println("enter the number:");
				int x= in.nextInt();
				for (int line = 1; line <=x; line++) {
					for (int no =1; no <=line; no++) {
						System.out.print(no+" ");
						
					}
					System.out.println();
					
				}
			}
}
/*
1
12
123
1234   */