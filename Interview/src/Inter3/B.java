package Inter3;

public class B extends A {
	// beacuse of static key word here the the add method is not override but it
	// hide the method add in the class A
	//@Override we cant it gives error beacuse static method not override it hide only
	public static void add() {
		System.out.println("in b");

	}

	public static void main(String[] args) {
		A a = new B();
		a.add();
	}
}
