package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int ID;
	private String Name;
	private int Age;
	private String Address;
	private long PhoneNo;
	
	//No-Argument Constructor
	public Employee() {	
	}
	
	//Argument Constructor
	public Employee(int iD, String name, int age, String address, long phoneNo) {
		super();
		ID = iD;
		Name = name;
		Age = age;
		Address = address;
		PhoneNo = phoneNo;
	}
	
	//Public Getter & Setter
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", PhoneNo="
				+ PhoneNo + "]";
	}
	
	
}
