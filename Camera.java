package com.onesoft.oops1;

public class Camera {
	private String brand;
	private int price;
	private String model;
	private String lensType;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setLensType(String lensType) {
		this.lensType=lensType;
	}
	public String getLensType() {
		return lensType;
	}
	public Camera(String brand) {
		this.brand=brand.toUpperCase();
	}
	public String toString() {
		return "\nCAMERA BRAND = "+brand;
	}
}
