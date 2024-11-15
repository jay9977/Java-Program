package com.calculator;

import java.util.*;

public class Calculator {

	public static void addition(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));

	}

	public static void multiplication(int x, int y) {
		System.out.println(x + "*" + y + "=" + (x * y));

	}

	public static void division(int x, int y) {
		System.out.println(x + "%" + y + "=" + (x / y));

	}

	public static void subtraction(int x, int y) {
		System.out.println(x + "-" + y + "=" + (x - y));

	}

	public static void main(String[] args) {
		System.err.println("======================================Menu============================================");
		System.out.println("1.Adition");
		System.out.println("2.Multiplacation");
		System.out.println("3.division");
		System.out.println("4.Subtraction");
		System.out.println("========================================================================================");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Choice:");
		int button = in.nextInt();
		System.out.println("enter the 1st number:");
		int x = in.nextInt();
		System.out.println("enter the 2nd number:");
		int y = in.nextInt();
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
}
