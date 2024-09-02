package com.tnsif.interfaceprogram;

public interface Amazon {
	int a=10;
	void welcome(); //abstract methods
	void thankyou(); //abstract methods
	
	default void servicecharge() {
		int amt = 100;
		System.out.println("The Service Charge is"+amt);
	}
	static void aboutUs() {
		System.out.println("It's a E-Commerce website");
	}
}
