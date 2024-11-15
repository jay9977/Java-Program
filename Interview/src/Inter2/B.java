package Inter2;

public class B extends A {
	
	B(){//you cant decler mathod inside constructor
		public void add() {
			System.out.println("in b");
		}
		
	}
	public static void main(String[]args) {
		A a=new B();
		a.add();
	}
}
