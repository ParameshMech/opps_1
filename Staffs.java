package com.onesoft.oops1;

public class Staffs {
	private String name;
	private int id;
	private int salary;
	private String department;
	private String designation;
	private String address;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	//Method for Sum of Staff's Salary:
	public int sumSalary(Staffs[] staffs) {
		int sum=0;
		for(int i=0; i<staffs.length; i++) {
			sum=sum+(staffs[i].getSalary());
		}
		return sum;
	}
}


