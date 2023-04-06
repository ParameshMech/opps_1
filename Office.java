package com.onesoft.oops1;

public class Office {
	public static void main(String[] args) {
		
		Address address1=new Address();
		address1.setDoorNo(12);
		address1.setStreet("1st Avenue");
		address1.setCity("Chennai");
		Address address2=new Address();
		address2.setDoorNo(10);
		address2.setStreet("2nd Avenue");
		address2.setCity("Chennai");
		Address address3=new Address();
		address3.setDoorNo(8);
		address3.setStreet("3rd Avenue");
		address3.setCity("Chennai");
		
		Staffs staff1=new Staffs();
		staff1.setName("Ram");
		staff1.setID(1051);
		staff1.setSalary(25000);
		Staffs staff2=new Staffs();
		staff2.setName("Rajkumar");
		staff2.setID(1062);
		staff2.setSalary(28000);
		Staffs staff3=new Staffs();
		staff3.setName("Rahul");
		staff3.setID(1056);
		staff3.setSalary(30000);
		Staffs staff4=new Staffs();
		staff4.setName("Suresh");
		staff4.setID(1053);
		staff4.setSalary(24000);
		
		Staffs[] staffs= {staff1,staff2,staff3,staff4};
	
		System.out.println("Sum of Staff's Salary: "+staff1.sumSalary(staffs));
	
	}

}
