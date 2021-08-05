package com.Turner.Phone;

public class PhoneTest {

	public static void main(String[] args) {
		Nokia test = new Nokia("11", 35,"sprint","Baring");
		System.out.println(test.unlock());
		Iphone test2 = new Iphone("11", 35,"USCellular","Brring");
		System.out.println(test2.ring());
	}
}
