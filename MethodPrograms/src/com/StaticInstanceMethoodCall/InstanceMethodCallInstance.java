package com.StaticInstanceMethoodCall;

public class InstanceMethodCallInstance {
   public void m1() {
	   System.out.println("i am instance method m1");
	   m2();
   }
   public void m2() {
      System.out.println("I am instance method m2");
       
   }
	public static void main(String[] args) {
		InstanceMethodCallInstance x=new InstanceMethodCallInstance();
		x.m1();
}

}
//here the instance method is call instance method jvm create one object in memory and method m1 and m2 are are store in that same place.