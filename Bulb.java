package com.xworkz.accessmodifier.defaultmodifier;

public class Bulb {
	
	String company;
	 double price;
	 
	 Bulb(String incompany,double inprice){
		 company = incompany;
		 price = inprice;
	 }
	 
	  void lighting() {
		  
		  System.out.println("Lighting");
	  }
	 
}
