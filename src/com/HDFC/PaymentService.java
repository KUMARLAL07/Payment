package com.HDFC;

public class PaymentService {
	
private  Ipayment payment;

	public PaymentService(Ipayment payment) {
		
		this.payment = payment;
	}
	
	public void setpayment(Ipayment payment) {
		this.payment=payment;
			
	}
	public void DOPayment(double billAmt) {
		boolean status = payment.ProcessPayment(billAmt);
		
		if(status) {
			System.out.println("printing Recipt..");
		}else {
			System.out.println("Payment Decline..");
		}
	}
	
	
}
