package com.DefaultMethod;

public class Def {
   void k() {
	System.out.println("I am the method k in class def of defaultamethod Package");

}
   public static void main(String[] args) {
	Def a= new Def();
	a.k();//default method invoke in same class
}
}
