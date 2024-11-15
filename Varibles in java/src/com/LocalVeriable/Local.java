package com.LocalVeriable;

public class Local {
	public void m1() {
		int x=1;//this x are access in {} this scope only where it created
		System.out.println(x);

	}
	//another block
	{
		//System.out.println(x);  we can call here also because it is also a different scope
	}
	
	public static void main(String[] args) {
		//System.out.println(x);  we can't call  local variable here because it is in another scope
	    Local x= new Local();
	    x.m1();
	}
	

}
/*-they are created inside block or method
-there scope is limited to scope of block or method inside which the they are created.
-we can’t call them outside block or method.
-local variables have to be initialized    */
