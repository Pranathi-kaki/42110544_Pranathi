package com.Polymorphism;

abstract class Payment{
	abstract void processPayment();
}

class CashPayment extends Payment{
	@Override
	void processPayment() {
	System.out.println("The payment option choosen is: Cash Payment\n");
	}
}

class CardPayment extends Payment{
	@Override
	void processPayment() {
		System.out.println("The payment option choosen is: Card Payment");
	}
}

public class Payment_System {

	public static void main(String[] args) {
		CashPayment cash = new CashPayment();
		cash.processPayment();
		
		CardPayment card = new CardPayment();
		card.processPayment();
	}

}
