package com.instanceVariable;
//instance variable
public class Instance {
	 int x=10; //instance variable written at class level
	public static void main(String[] args) {
		Instance a=new Instance();//a has separate obj a store 10 separately
		Instance y=new Instance();//y has separate obj y store 10 separately
		y.x=y.x +5; //y make change in there x obj but not in a's obj
		System.out.println(a.x);
		System.out.println(y.x);
		
	}

}
//instance variable is belongs to object
//it written at class level
//it written outside any method
//they have separate copies for each object / it has multiple copies in the memory the number of object we are creating