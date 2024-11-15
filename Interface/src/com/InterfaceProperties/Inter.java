package com.InterfaceProperties;

//program for specifying variable in interface are public static final @ default concrete method  
public interface Inter {
	int i = 20;// public static final variable

	void m1();// abstract method

	void m2();// abstract method

	void m3();// abstract method
	// default concrete method default is keyword 1.8 version

	public default void m4() {
		System.out.println("i am default concrete method in interface Inter");
	}

	// static method 1.8 version
	public static void m5() {
		System.out.println("i am public static concrete method in interface Inter");
	}

}
//all methods in interface are abstract 
//100% abstraction
//multiple inheritance are allowed in case of interface because method in it has no body
//variables in interface are static final
//java 1.8 introduce default concrete method in interface for backward compatibility  
/*
 * ( means when we create 5 abstract method in interface and implements it in
 * the class then we have no problem but in future if we wants to add the new
 * method in the interface but it is not useful for that that class but useful
 * for another class then in mey create problem because we have to implement all
 * abstract method in interface at that situation java provide us facility of
 * default concrete method means method which has body so we can easily
 * implement in the class where it has some need
 */
//introduce static method in interface 