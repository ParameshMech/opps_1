package com.onesoft.oops1;

public class UseMobile {
	public static void main(String[] args) {
		/*Camera camera1=new Camera();
		Mobile mobile1=new Mobile();
		
		camera1.setBrand("Xiaomi");
		camera1.setModel("XI");
		camera1.setLensType("Ultra Wide");
		camera1.setPrice(3500);
		
		mobile1.setBrand("Redmi");
		mobile1.setColor("Techno Blue");
		mobile1.setModel("Note 11S");
		mobile1.setCamera(camera1);
		
		System.out.println("Mobile model: "+mobile1.getModel());
		System.out.println("Camera Lens Type: "+mobile1.getCamera().getLensType());
		*/
		Camera camera=new Camera("Xiaomi");
		Mobile mobile=new Mobile("Redmi","Note 11S","Techno Blue",12500,camera);
		System.out.println(mobile);
	}
}
