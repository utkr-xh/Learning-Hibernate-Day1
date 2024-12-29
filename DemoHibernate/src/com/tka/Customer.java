package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int Customer_Id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private long PhoneNo;
	
	//No-Argument Constructor
	public Customer() {
		
	}
	
	//Argument Constructor
	public Customer(int customer_Id, String first_Name, String last_Name, String email, long phoneNo) {
		super();
		Customer_Id = customer_Id;
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
		PhoneNo = phoneNo;
	}
	
	//Public Getter& Setter
	public int getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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
		return "Customer [Customer_Id=" + Customer_Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name
				+ ", Email=" + Email + ", PhoneNo=" + PhoneNo + "]";
	}
	
	
	
	
}
