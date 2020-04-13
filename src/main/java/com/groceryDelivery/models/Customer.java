package com.groceryDelivery.models;

public class Customer {
	
	int customerId;
	String customerUserName;
	String customerUserEmail;
	String customerUserPassword;
	long mobileNo;
	String address;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerUserName() {
		return customerUserName;
	}
	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}
	public String getCustomerUserEmail() {
		return customerUserEmail;
	}
	public void setCustomerUserEmail(String customerUserEmail) {
		this.customerUserEmail = customerUserEmail;
	}
	public String getCustomerUserPassword() {
		return customerUserPassword;
	}
	public void setCustomerUserPassword(String customerUserPassword) {
		this.customerUserPassword = customerUserPassword;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
