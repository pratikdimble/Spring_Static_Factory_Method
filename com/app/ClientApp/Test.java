package com.app;

import java.util.Calendar;

public class Test {
	private int id;
	private String Name;
	private String City;
	public Test() {
		super();
		System.out.println("******WELCOME******");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	Calendar c=Calendar.getInstance();
	
	public Calendar getC() {
		return c;
	}
	public void setC(Calendar c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", Name=" + Name + ", City=" + City + ", c=" + c + "]";
	}

		

}
