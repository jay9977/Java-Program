package com.MultipleInhertanceINInterface;

public class Addition implements Inter2, Inter1 {

	@Override// method in Inter2
	public void calculate() {
		System.out.println(2 + 2);

	}
	@Override// method in Inter1
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override// method in Inter1
	public void m3() {
		// TODO Auto-generated method stub

	}

	@Override// method in Inter2
	public void m4() {
		// TODO Auto-generated method stub

	}

	@Override// method in Inter2
	public void m5() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.calculate();
	}

	

}
//here the calculate method of Interface Inter2 call because it written at first .
//but when calculate method of Inter1 Interface is write first then the calculate method of Inter1 is gonna call
// multiple inheritance is allow in case if interface because there is o chance of ambiguity
