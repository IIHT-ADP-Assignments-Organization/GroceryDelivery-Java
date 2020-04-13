package com.groceryDelivery.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.groceryDelivery.models.Admin;
import com.groceryDelivery.models.Category;
import com.groceryDelivery.models.Customer;
import com.groceryDelivery.models.Grocery;
import com.groceryDelivery.models.Offer;
import com.groceryDelivery.models.Payment;
import com.groceryDelivery.models.Slot;
import com.groceryDelivery.services.AdminService;
import com.groceryDelivery.services.CustomerService;



public class TestFunctional {

	@Test
	public void testLogin()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	Admin admin = new Admin();
		admin.setUsername("Ram");
		admin.setPassword("ram1234");
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean adminfromdb = adminservice.login(admin.getUsername(),admin.getPassword());
		assertSame(true,adminfromdb);
	}
	
	
	@Test
	public void addGrocery() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Grocery result = adminservice.addGrocery(grocery);
		assertNotNull(result);
							
	}
	
	@Test
	public void addCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(2);
		category.setCategoryName("Dall");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Category result = adminservice.addCategory(category);
		assertNotNull(result);
							
	}
	
	@Test
	public void addOffer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Offer offer = new Offer();
		offer.setOfferId(1);
		offer.setOfferDetails("5%");
		offer.setGroceryId(1);
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Offer result = adminservice.addOffer(offer);
		assertNotNull(result);
							
	}
	
	@Test
	public void addPayment() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Payment payment = new Payment();
		payment.setPaymentId(1);
		payment.setPaymentMode("cash on delivery");

		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Payment result = adminservice.addPaymentMethods(payment);
		assertNotNull(result);
							
	}
	
	@Test
	public void deleteGrocery() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteGrocery(grocery.getGroceryId());
		 assertSame(1,result);
		
						
	}
	
	@Test
	public void deleteCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Category category = new Category();
		category.setCategoryId(2);
		category.setCategoryName("Dall");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteGrocery(category.getCategoryId());
		 assertSame(1,result);
		
						
	}
	
	@Test
	public void deleteOffer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		
		Offer offer = new Offer();
		offer.setOfferId(1);
		offer.setOfferDetails("5%");
		offer.setGroceryId(1);
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		boolean result = adminservice.deleteOffer(offer.getOfferId());
		 assertSame(1,result);
		
						
	}
	
	@Test
	public void viewOffer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Offer offer = new Offer();
		offer.setOfferId(1);
		offer.setOfferDetails("5%");
		offer.setGroceryId(1);
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Offer result = adminservice.viewOffer(offer.getOfferId());
		assertNotNull(result);
							
	}
	
	@Test
	public void viewGrocery() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Grocery result = adminservice.viewGrocery(grocery.getGroceryId());
		assertNotNull(result);
							
	}
	
	@Test
	public void viewCategory() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Category category = new Category();
		category.setCategoryId(2);
		category.setCategoryName("Dall");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Category result = adminservice.viewCategory(category.getCategoryId());
		assertNotNull(result);
							
	}
	
	@Test
	public void viewAllCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerUserName("john");
		customer.setCustomerUserPassword("john1234");
		customer.setCustomerUserEmail("john@gmail.com");
		customer.setMobileNo(123456788);
		customer.setAddress("benglore");
		
		AdminService adminservice = (AdminService) context.getBean("adminService");
		Customer result = adminservice.viewAllCustomer(customer.getCustomerId());
		assertNotNull(result);
							
	}
	
	@Test
	public void testCustomerlogin()
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
		boolean customerfromdb = customerservice.login(customer.getCustomerUserName(),customer.getCustomerUserPassword());
		assertSame(true,customerfromdb);
		
	}
	
	@Test
	public void testSignUp()
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
		boolean customerfromdb =customerservice.signUp(customer);
		assertSame(customer,customerfromdb);
	}
	@Test
	public void allotSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Slot slot = new Slot();
		slot.setSlotId(1);
		slot.setSlotNumber(10);
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Slot result = customerservice.allotSlot(slot);
		assertNotNull(result);
							
	}
	
	@Test
	public void chooseSlot() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
	
		Slot slot = new Slot();
		slot.setSlotId(1);
		slot.setSlotNumber(10);
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Slot result = customerservice.chooseSlot(slot);
		assertNotNull(result);
							
	}
	
	@Test
	public void makePayment() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		Payment payment = new Payment();
		payment.setPaymentId(1);
		payment.setPaymentMode("cash on delivery");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Payment result = customerservice.makePayment(payment,customer.getCustomerId());
		assertNotNull(result);
							
	}
	
	@Test
	public void purchaseGrocery() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Grocery result = customerservice.purchaseGrocery(grocery,customer.getCustomerId());
		assertNotNull(result);
							
	}
	
	@Test
	public void viewGroceryByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Grocery result = customerservice.viewGrocery(grocery);
		assertNotNull(result);
							
	}
	
	@Test
	public void searchGroceryByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");
		Customer customer = new Customer();
		Grocery grocery = new Grocery();
		grocery.setGroceryId(1);
		grocery.setGroceryName("thoordal");
		grocery.setGroceryPrice(120);
		grocery.setCategory("dall");
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Grocery result = customerservice.searchGrocery(grocery);
		assertNotNull(result);
							
	}
	
	
	@Test
	public void viewOfferByCustomer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("content-application.xml");

		Offer offer = new Offer();
		offer.setOfferId(1);
		offer.setOfferDetails("5%");
		offer.setGroceryId(1);
		
		CustomerService customerservice = (CustomerService) context.getBean("customerService");
		Offer result = customerservice.viewOffers(offer);
		assertNotNull(result);
							
	}
	
	
	
}
