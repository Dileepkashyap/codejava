package com.tnsif.inheritance;

public class Students extends Customers{

	private String clgname;
	private int rollNo;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(String name, int id, long aadhaarNo, long phoneNo, String clgname, int rollNo) {
		super(name, id, aadhaarNo, phoneNo);
		// TODO Auto-generated constructor stub
		this.clgname = clgname;
		this.rollNo = rollNo;
		
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	//printing the details
	public String toString() {
		return "Student [clgname=" + clgname + ", rollNo=" + rollNo + ", getName()=" + getName() + ", getId()="
				+ getId() + ", getAadhaarNo()=" + getAadhaarNo() + ", getPhoneNo()=" + getPhoneNo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
