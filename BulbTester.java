package com.xworkz.accessmodifier.defaultmodifier;

public class BulbTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb bulb = new Bulb("Havells",350.00);
		bulb.company = "Havells";
		bulb.price = 350.00;
		
		bulb.lighting();
	}

}
