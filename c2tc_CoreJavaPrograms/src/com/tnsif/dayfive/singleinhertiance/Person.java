//This program to demonstrate the person base class
package com.tnsif.dayfive.singleinhertiance;
public class Person {
	private int id;
	private String name;
	private String city;
	public Person()//Default constructor
	{
		this.id=101;
		this.name="unknown";
		this.city="chennai";
	}
	public person() 
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}