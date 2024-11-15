package com.testingshastra;

import java.util.Iterator;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		int a[] = { 1,2,3,4,5 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;

				}

			}
			
        
		}

		 for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
	}
}