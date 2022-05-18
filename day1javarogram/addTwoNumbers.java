package com.demo.add;

class BusinessLogic {
	void addDemo() {
		int number1 = 32;
		int number2 = 32;
		int result = number1 + number2;
		System.out.println("Sum of two numbers " + "" + result);
	}
}

public class addTwoNumbers {
	public static void main(String a[]) {
		BusinessLogic b = new BusinessLogic();//created object here
		b.addDemo();
	}
}
