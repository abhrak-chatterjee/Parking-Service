package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer 
{
	Customer customer = new Customer();
	
	@Test
	public void testGetCustomerName() 
	{
		assertNull(customer.getCustomerName());
	}

	@Test
	public void testSetCustomerName() 
	{
		customer.setCustomerName("Abhrak");
		assertEquals("Abhrak",customer.getCustomerName());
	}

	@Test
	public void testGetCustomerPhoneNumber() 
	{
		customer.setCustomerPhoneNumber(254684);
		assertNotNull(customer.getCustomerPhoneNumber());
	}

	@Test
	public void testSetCustomerPhoneNumber() 
	{
		customer.setCustomerPhoneNumber(2441139);
		assertEquals(2441139, customer.getCustomerPhoneNumber());
	}

	@Test
	public void testGetCustomerId() 
	{
		assertNull(customer.getCustomerId());
	}

	@Test
	public void testGetCustomerInTime() 
	{
		Customer customer = new Customer("Abhrak","1",2441139,System.currentTimeMillis());
		assertEquals(System.currentTimeMillis(), customer.getCustomerInTime());
	}

}
