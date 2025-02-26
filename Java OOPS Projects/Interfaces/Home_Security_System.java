package com.Interfaces;

interface Alarm{
   public void activate();
   public void deactivate();
}

class FireAlarm implements Alarm{
	@Override
	public void activate() {
		System.out.println("Fire Alarm is Active");
	}
	@Override
	public void deactivate() {
		System.out.println("Fire Alarm is Deactivated\n");
	}
}

class BurglarAlarm implements Alarm{
	
	@Override
	public void activate() {
		System.out.println("Burglar Alarm is Active");
	}
	@Override
	public void deactivate() {	
		System.out.println("Burglar Alarm is Deactivated");
	}
}

public class Home_Security_System {
	public static void main(String args[]){
		FireAlarm firealarm = new FireAlarm();
		firealarm.activate();
		firealarm.deactivate();
		
		BurglarAlarm burglaralarm = new BurglarAlarm();
		burglaralarm.activate();
		burglaralarm.deactivate();
	}

}
