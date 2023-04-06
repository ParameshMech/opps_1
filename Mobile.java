package com.onesoft.oops1;

public class Mobile {
	private String brand;
	private String model;
	private String color;
	private int price;
	private Camera camera;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void getPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setCamera(Camera camera) {
		this.camera=camera;
	}
	public Camera getCamera() {
		return camera;
	}
	
	public Mobile(String brand, String model, String color, int price, Camera camera  ) {
		this.brand=brand.toUpperCase();
		this.model=model.toUpperCase();
		this.color=color.toUpperCase();
		this.price=price;
		this.camera=camera;
	}
	
	public String toString() {
		//return "BRAND = "+brand+"\nMODEL = "+model+"\nCOLOR = "+color+"\nPRICE = "+price+"\nCAMERA BRAND = "+camera.getBrand();
		return "BRAND = "+brand+"\nMODEL = "+model+"\nCOLOR = "+color+"\nPRICE = "+price+camera;
	}
}
