//creating arry using new keyword and inserting elements dynamically and displaying elements dynamically
package com.oneDArrayProgram;
import java.util.*;
public class Practice {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int sizeOfArray= in.nextInt();
		int array[]=new int[sizeOfArray];
		//inserting elements in array dynamically
		for (int i = 0; i < sizeOfArray; i++) {
			array[i]=in.nextInt();
			
		}
		//displaying elements in array dynamically
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
	}

}
