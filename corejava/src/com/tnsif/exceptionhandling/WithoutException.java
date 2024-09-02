package com.tnsif.exceptionhandling;

public class WithoutException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 0;
		try {
		int a = 42/d;// exception raised
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled successfully"+e.getMessage());
		}
		System.out.println("will not be printed");

	}

}
