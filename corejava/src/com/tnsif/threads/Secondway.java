package com.tnsif.threads;

public class Secondway implements Runnable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Secondway t = new Secondway();
		Thread th=new Thread(t);
		th.start();//runnable
		//th.start();//illegal thread state
		th.run();//it will act as normal thread method

	}
	public void run() {
		System.out.println("creation of thread class by using runnable");
	}
}
