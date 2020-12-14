package com.xworkz.accessmodifier.privatemodifier;

class Animal {
	String color;
	String shape;
	
	private Animal(String incolor, String inshape) {
		color = incolor;
		shape = inshape;
		
	}


	void breathing()
	{
		System.out.println("Breathing");
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal("Black","Normal");
		animal.color = "Lion";
		animal.shape = "Normal";
		
		animal.breathing();
	}
}
