package com.groceryDelivery.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.groceryDelivery.models.Customer;



public class TestBoundary {
	

	 @Test
	    public void testpasswordLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerUserName("john");
			customer.setCustomerUserPassword("john1234");
			customer.setCustomerUserEmail("john@gmail.com");
			customer.setMobileNo(123456788);
			customer.setAddress("benglore");
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getCustomerUserPassword().length());


	    }

	 @Test
	    public void testPhoneNumberLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerUserName("john");
			customer.setCustomerUserPassword("john1234");
			customer.setCustomerUserEmail("john@gmail.com");
			customer.setMobileNo(123456788);
			customer.setAddress("benglore");
	        		
	        long MobileNumberLength=10;
	        
	    assertEquals( MobileNumberLength,customer.getMobileNo());


	    }
	 
	 @Test
	    public void testEmailLength()
	    {
		 Customer customer = new Customer();
			customer.setCustomerId(1);
			customer.setCustomerUserName("john");
			customer.setCustomerUserPassword("john1234");
			customer.setCustomerUserEmail("john@gmail.com");
			customer.setMobileNo(123456788);
			customer.setAddress("benglore");
	        		
	        int emailLength=10;
	assertEquals(emailLength,customer.getCustomerUserEmail().length());

	    }
	 
}
