package com.kn.aggregate;

public class Pilot {
	String name;
	
	public void fly()
	{
		System.out.println(this.name+" is flying..");
	}

	public Pilot(String name) {
		super();
		this.name = name;
	}
	
	
}
