package com.Abstraction;

abstract class Product{
	abstract void calculatePrice();		
}

class Electronics extends Product{
	@Override
	void calculatePrice() {
		System.out.println("Electronics Gadgets present : Personal Devices: 8,000 to 1,20,000\nHome Gadgets: 1,500 to 2,50,000\nWork/Study Gadgets: 1,500 to 2,50,000\nGaming Devices: 25,000 to 4,00,000\nTravel Gadgets: 800 to 15,000\nOther Useful Gadgets\n\n");
	}
}
class Clothing extends Product{
	@Override
	void calculatePrice() {
		System.out.println("In Clothing we have :Everyday Wear: 500 to 5,000\nFormal Wear: 1,000 to 10,000\nEthnic/Traditional Wear: 1,000 to 15,000\nOuterwear: 1,500 to 20,000\nSleepwear: 500 to 3,000\nOthers");
	}
}

public class E_commerce_System {
	public static void main(String args[]){
	Electronics E = new Electronics();
	E.calculatePrice();
	
	Clothing C = new Clothing();
	C.calculatePrice();
	
	}
}
