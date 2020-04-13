package com.groceryDelivery.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groceryDelivery.models.Customer;
import com.groceryDelivery.models.Grocery;
import com.groceryDelivery.models.Offer;
import com.groceryDelivery.models.Payment;
import com.groceryDelivery.models.Slot;

@Component
@Service ("customerService")
public class CustomerServiceDaoImpl implements CustomerServiceDao {

	@Autowired
	@Transactional
	public boolean signUp(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean login(String customerUsername, String customerPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Slot allotSlot(Slot slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Slot chooseSlot(Slot slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Payment makePayment(Payment payment, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Grocery purchaseGrocery(Grocery grocery, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Grocery viewGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Grocery searchGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Offer viewOffers(Offer offer) {
		// TODO Auto-generated method stub
		return null;
	}

}
