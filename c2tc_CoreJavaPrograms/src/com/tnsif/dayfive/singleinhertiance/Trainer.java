//This program to demonstrate trainer sub class or derived class
package com.tnsif.dayfive.singleinhertiance;

public class Trainer extends Person {
	private String designation;
	private String location;
	public Trainer()//default constructor
	{
		super();//calling base class constructor
		this.designation="program trainer";
		this.location="chennai";
	}
	public Trainer(int id,String name,String city,String designation,String location)
	{
		super();//calling base class parameterized
		this.designation=designation;
		this.location=location;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Trainer [id:"+getId()+" name:"+getName()+" city:"+getCity()+"designation=" + designation + ", location=" + location + "]";
	}
	

}
