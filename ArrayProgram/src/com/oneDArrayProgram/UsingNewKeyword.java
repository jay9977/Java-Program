//using new keyword crate array inserting value manully and displaying it dynamically.
package com.oneDArrayProgram;
import java.util.*;
public class UsingNewKeyword {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("enter the size of array:");
	int size=in.nextInt();
	int arry[]=new int[size];
	arry[0]=2;
	arry[1]=3;
	arry[2]=4;
	for (int i = 0; i < arry.length; i++) {
		System.out.println(arry[i]);
	}
}
}
