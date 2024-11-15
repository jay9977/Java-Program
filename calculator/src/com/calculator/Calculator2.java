package com.calculator;
import java.util.*;

public class Calculator2 {
  // method for selecting operation we wants too perform.
	public static void choice(int button, int x, int y) {

		switch (button) {
		case 1:
			addition(x, y);
			break;
		case 2:
			multiplication(x, y);
			break;
		case 3:
			division(x, y);
			break;
		case 4:
			subtraction(x, y);
			break;

		default:
			break;
		}

	}
     //method for performing addition
	public static void addition(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));

	}
    //method for performing multiplication
	public static void multiplication(int x, int y) {
		System.out.println(x + "*" + y + "=" + (x * y));

	}
      //method for performing division
	public static void division(int x, int y) {
		System.out.println(x + "/" + y + "=" + (x / y));

	}
    // method for performing subtraction
	public static void subtraction(int x, int y) {
		System.out.println(x + "-" + y + "=" + (x - y));

	}
     //main method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continueCalculation = true;
		while (continueCalculation) {
			System.out.println(
					"======================================MENU===================================================");
			System.out.println("1.Addition");
			System.out.println("2.Multiplication");
			System.out.println("3.Division");
			System.out.println("4.Subtraction");
			System.out.println(
					"===============================================================================================");
			System.out.println("Enter your choice:");
			int button = in.nextInt();
			System.out.println("Enter the 1st Number:");
			int x = in.nextInt();
			System.out.println("enter the 2nd Number:");
			int y = in.nextInt();
			choice(button, x, y);//choice method call ad passing buttton, x and y's value
			System.out.println("Do You Wnat to Continue(y/n):");
			String c = in.next();
			//conditional statement for continue calculation or not
		/*	switch (c) {
			case "y":
				;
				break;
			case "n":
				continueCalculation = false;
				break;
			default:
				System.out.println("Invalid input. Exiting.");
				continueCalculation = false;
				break; 
			}  */
			if(c.equals("y")) {
				continueCalculation = true;
			}else {
				continueCalculation = false;
			}
		}
	}
}
