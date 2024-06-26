package com.tnsif.encapsulationprogram;

public class EncapsulationDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation ob = new Encapsulation();
//		ob.name="Dileep";
//		ob.age=24;
//		ob.serialNum=21;
		
		ob.setAge(21);
		ob.setName("Dileep");
		ob.setSerialNum(20);
		System.out.println(ob);

	}
     
}
