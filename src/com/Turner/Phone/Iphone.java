package com.Turner.Phone;

public class Iphone extends Phone implements Ringable {
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		return "doodly doodly doo!";
	}
	@Override
	public String unlock() {
		return "Unlockerino'd";
	}
	@Override
	public void displayInfo() {
		System.out.println("I'm an Iphone, I don't work! :D");
	}
}

