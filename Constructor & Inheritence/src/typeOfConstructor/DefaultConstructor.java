package typeOfConstructor;

public class DefaultConstructor {
	// developers compiler
	public DefaultConstructor() {
		System.out.println("i am default constructor");
	}

	public static void main(String[] args) {
		DefaultConstructor x = new DefaultConstructor();// constructor call
	}

}
//here the developers compiler call because java compiler gives first priority to the developers constructor
//if developer not write the constructor then default constructor created by the compiler.