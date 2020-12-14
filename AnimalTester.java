package com.xworkz.accessmodifier.privatemodifier;

import com.xworkz.accessmodifier.defaultmodifier.Bulb;

public class AnimalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Black");
		animal.color = "Black";
		animal.shape = "normal";
		
		animal.breathing();
	}

}
