package com.kn.aggregate;

public class Airline {
	String name;
	Pilot pilot;
	
	public void operate()
	{
		System.out.println(this.name+" is operating...");
	}

	public Airline(String name, Pilot pilot) {
		super();
		this.name = name;
		this.pilot = pilot;
	}
	
}
