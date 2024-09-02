package com.tnsif.inheritance;

public class Customers {

	private String name;
	private int id;
	private long aadhaarNo;
	private long phoneNo;
	//parameterized constructor
	public Customers(String name, int id, long aadhaarNo, long phoneNo) {
		super();
		this.name = name;
		this.id = id;
		this.aadhaarNo = aadhaarNo;
		this.phoneNo = phoneNo;
	}
	//default constructor
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", id=" + id + ", aadhaarNo=" + aadhaarNo + ", phoneNo=" + phoneNo + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(long aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
