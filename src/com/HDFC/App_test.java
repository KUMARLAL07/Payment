package com.HDFC;

public class App_test {
	public static void main(String[] args) {

		Ipayment p = new CreditCard();
		PaymentService s1 = new PaymentService(p);
		s1.setpayment(p);
		s1.DOPayment(45000.00);
	}
}
