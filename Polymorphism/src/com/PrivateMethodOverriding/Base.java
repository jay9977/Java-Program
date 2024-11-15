package com.PrivateMethodOverriding;

class Base {
	public void m1() {
		System.out.println("I am private method m1 of Base class");

	}

}
//this program is write to understand the visibility table of overriding 
//where we can't decrease the visibility of parent class in child class 
//if parent class method access specifire is public ---->we override  then override method should be public
//such as private ------> cannot override in child class
// protected----------> will be public ,protected not default and private in child class
//default-------------> will be public ,default ,protected and not private.