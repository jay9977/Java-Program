package com.Blocks;

public class StaticBlock {
	static {
		System.out.println("hellow world");
		{
			System.out.println("hii");
		} // –inner nlock/local block
	}

	public static void main(String[] args) {
		System.out.println("hii");
	}
}
