package com.capgemini;

public class Customer 
{
	private String customerName, customerId;
	private long customerPhoneNumber, customerInTime;
	
	public Customer() 
	{
		super();
	}

	public Customer(String customerName, String customerId, long customerPhoneNumber, long customerInTime) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPhoneNumber = customerPhoneNumber;
		this.customerInTime = customerInTime;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public long getCustomerPhoneNumber() 
	{
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(long customerPhoneNumber) 
	{
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerId() 
	{
		return customerId;
	}

	public long getCustomerInTime() 
	{
		return customerInTime;
	}

	@Override
	public String toString() {
		return "[Name=" + customerName + ", Id=" + customerId + ", Phone="
				+ customerPhoneNumber + ", InTime=" + customerInTime + "]";
	}
	
}
