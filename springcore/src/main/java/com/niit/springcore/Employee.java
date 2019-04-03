package com.niit.springcore;

//Bean or Model or POJO class
public class Employee {

	private int eid;
	private String ename;
	Address address;
	
	/*
	 * public Employee() {
	 * 
	 * System.out.println("Object Created"); }
	 */

	public Employee() {
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	

	
	
	
	
}
