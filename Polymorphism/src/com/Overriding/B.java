package com.Overriding;
public class B extends A {
   @Override
	public int add(int x,int y) {
	   return x*y;
   }
      public static void main(String[] args) {
		int x= new B().add(12, 2);
		System.out.println(x);
		
		
	}
}
