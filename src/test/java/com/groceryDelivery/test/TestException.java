package com.groceryDelivery.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groceryDelivery.common.GroceryNotFoundException;
import com.groceryDelivery.common.UserAlreadyExistException;
import com.groceryDelivery.models.Customer;
import com.groceryDelivery.models.Grocery;
import com.groceryDelivery.services.CustomerService;

import junit.framework.Assert;

public class TestException {

	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	 Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerUserName("john");
		customer.setCustomerUserPassword("john1234");
		customer.setCustomerUserEmail("john@gmail.com");
		customer.setMobileNo(123456788);
		customer.setAddress("benglore");
		
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		customerservice.signUp(customer);
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForGrocery() throws GroceryNotFoundException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	 Customer customer = new Customer();
	 Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		customerservice.searchGrocery(grocery);
Assert.assertEquals(GroceryNotFoundException.message,"Grocery not found");
    }
	
}
