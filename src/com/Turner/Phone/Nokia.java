package com.Turner.Phone;

public class Nokia extends Phone implements Ringable {
	public Nokia(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		return "BARRIIIIIIIIIIIING!";
	}
	@Override
	public String unlock() {
		return "Unlockeroo'd";
	}
	@Override
	public void displayInfo() {
		System.out.println("f");
	}
}
