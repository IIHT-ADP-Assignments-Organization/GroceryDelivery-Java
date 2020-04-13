package com.groceryDelivery.common;

public class GroceryNotFoundException extends Exception{
	
	public static  String message="GroceryNotFound";


	public GroceryNotFoundException()
	{
		
	}
	public GroceryNotFoundException(String message)
	{
		this.message=message;
	}


}
