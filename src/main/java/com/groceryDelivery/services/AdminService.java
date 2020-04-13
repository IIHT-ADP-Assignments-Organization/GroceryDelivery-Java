package com.groceryDelivery.services;

import java.util.List;

import com.groceryDelivery.models.Category;
import com.groceryDelivery.models.Grocery;
import com.groceryDelivery.models.Offer;
import com.groceryDelivery.models.Payment;
import com.groceryDelivery.models.Customer;

public interface AdminService {
	
	boolean login(String userName,String password);
	public Grocery addGrocery(Grocery grocery);
	public Category addCategory(Category category);
	public Offer addOffer(Offer offer);
	Customer viewAllCustomer (int customerId);
	public Payment addPaymentMethods(Payment payment);
	boolean deleteGrocery(int groceryId);
	boolean deleteCategory(int categoryId);
	boolean deleteOffer(int offerId);
	public Grocery viewGrocery(int groceryId);
	public Category viewCategory(int categoryId);
	public Offer viewOffer(int offerId);
		
	
}
