package com.HDFC;

public class CreditCard implements Ipayment{

	@Override
	public boolean ProcessPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("Credit card payment processed");
		return true;
	}

}
