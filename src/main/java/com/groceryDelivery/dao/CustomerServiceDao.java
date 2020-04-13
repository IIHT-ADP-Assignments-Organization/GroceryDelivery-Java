package com.groceryDelivery.dao;

import com.groceryDelivery.models.Customer;
import com.groceryDelivery.models.Grocery;
import com.groceryDelivery.models.Offer;
import com.groceryDelivery.models.Payment;
import com.groceryDelivery.models.Slot;

public interface CustomerServiceDao {
	
	boolean signUp(Customer customer);
	boolean login(String customerUsername,String customerPassword);
	public Slot allotSlot(Slot slot);
	public Slot chooseSlot(Slot slot);
	public Payment makePayment(Payment payment,int customerId);
	public Grocery purchaseGrocery(Grocery grocery,int customerId);
	public Grocery viewGrocery(Grocery grocery);
	public Grocery searchGrocery(Grocery grocery);
	public Offer viewOffers(Offer offer);

}
