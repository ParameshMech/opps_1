package com.onesoft.oops1;

public class UseCar {
	public static void main(String[] args) {
		Engine e1=new Engine();
		e1.brand="Tata";
		e1.price=500000;
		e1.noOfCylinder=6;
		Car c1=new Car();
		c1.brand="BMW";
		c1.color="Blue";
		c1.model="XUV";
		c1.price=5500000;
		c1.engine=e1;
		
		System.out.println("No of Cylinders in the Engine: "+c1.engine.noOfCylinder);
		System.out.println("Color of the Car: "+c1.color);
		System.out.println("Price of the Engine: "+c1.engine.price);
		//System.out.println(c1);
	}

}
