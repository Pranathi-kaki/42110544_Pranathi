package com.Inheritance;

class Applicance{
	String Brand,Model;
	
	Applicance(String Brand,String Model){
		this.Brand = Brand;
		this.Model = Model;
	}
	public void displayApplianceInfo(){
		System.out.println("Brand Name is : "+this.Brand);
		System.out.println("Model : "+this.Model+"\n");
	}
}

class WashingMachine extends Applicance{
	int loadCapacity;
	int spinSpeed;
	
	WashingMachine(String Brand,String Model,int loadCapacity,int spinSpeed){
		super(Brand,Model);
		this.loadCapacity = loadCapacity;
		this.spinSpeed = spinSpeed;
	}
	
	public void displayWashingMachineInfo(){
		displayApplianceInfo();
		System.out.println("Load capacity of Washing Machine is "+this.loadCapacity);
		System.out.println("Spin speed of Washing Machine is "+this.spinSpeed +"\n");
	}
	
	public void calculateEnergyConsumption(){
		System.out.println("The Energy comsumption of the Washing Machine is : "+(loadCapacity*spinSpeed*0.0002)+"\n");
	}
}

class Refrigerator extends Applicance{
	int capacity,energyRating;
	
	Refrigerator(String Brand,String Model,int capacity,int energyRating){
		super(Brand,Model);
		this.capacity = capacity;
		this.energyRating = energyRating;
	}
	public void displayRefrigeratorInfo(){
		displayApplianceInfo();
		System.out.println("Capacity of Washing Machine is "+this.capacity);
		System.out.println("Energy Rating of Washing Machine is "+this.energyRating+"\n");
	}
	public void calculateEnergyConsumption(){
		System.out.println("The Energy comsumption of the Washing Machine is : "+(capacity*0.001)+"\n");
	}
	
}

public class Applicance_store {

	public static void main(String[] args) {
		WashingMachine WM = new WashingMachine("LG","LG WM4000HWA",10,800);
		WM.displayWashingMachineInfo();
		WM.calculateEnergyConsumption();
		
		Refrigerator fridge = new Refrigerator("Bajaj","LG GL-S322SDSY",308,4);
		fridge.displayRefrigeratorInfo();
		fridge.calculateEnergyConsumption();

	}

}
