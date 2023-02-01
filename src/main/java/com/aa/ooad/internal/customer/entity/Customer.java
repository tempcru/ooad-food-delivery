package com.aa.ooad.internal.customer.entity;

public class Customer {

	private String customerId;
	private String customerName;
	private String address;
	private String zipcode;
	
	public Customer() {
	}

	public Customer(String customerId, String customerName, String address, String zipcode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.zipcode = zipcode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "이름 : " + customerName + " 주소 :"+ address;
	}
	
	
	
}
