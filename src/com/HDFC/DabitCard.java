package com.HDFC;

public class DabitCard implements Ipayment{

	@Override
	public boolean ProcessPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("Dabit card payment processed");
		return true;
	}

}
