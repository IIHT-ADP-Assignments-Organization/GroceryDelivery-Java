package com.groceryDelivery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groceryDelivery.dao.AdminServiceDao;
import com.groceryDelivery.models.Category;
import com.groceryDelivery.models.Customer;
import com.groceryDelivery.models.Grocery;
import com.groceryDelivery.models.Offer;
import com.groceryDelivery.models.Payment;

@Component
@Service("adminService")
public class AdminSetrviceImpl implements AdminService {

	@Autowired
	AdminServiceDao adminServiceDao;
	@Transactional
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Grocery addGrocery(Grocery grocery) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Offer addOffer(Offer offer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Customer viewAllCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Payment addPaymentMethods(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean deleteGrocery(int groceryId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean deleteOffer(int offerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Grocery viewGrocery(int groceryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Category viewCategory(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Offer viewOffer(int offerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
