package com.kn.aggregate;

public class AggregateDemo {

	public static void main(String[] args) {
		Pilot pilot1 = new Pilot("Venky");
		Airline airline = new Airline("AirIndia",pilot1);
		airline.operate();
		pilot1.fly();
	}

}
