package com.yash.SpringAOP.service;

public class PaymentServiceImpl implements PaymentService
{

	@Override
	public void makePayment(int amount) {
		// payment code
		System.out.println(amount+ "Amount debited..");
		//
		//
		//
		//
		System.out.println(amount+ "Amount credited..");

	}
	

}
