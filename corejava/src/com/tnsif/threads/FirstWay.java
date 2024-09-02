package com.tnsif.threads;

public class FirstWay extends Thread {
	public void run() {
		System.out.println("creation of thread class by extending thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstWay ob = new FirstWay();
		
		ob.start();
		ob.stop();
	}
}
