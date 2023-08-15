package com.HDFC;

public class Sodexo implements Ipayment{

	@Override
	public boolean ProcessPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("sodexo payment perocessed");
		return true;
	}

}
