package com.demo.add;

class addDemoReturn {

	int addDemo(int number1,int number2) {
		
		int result=number1+number2;
		return result;
	}
}
public class addTwoNumbersUsingReturnType {
	public static void main(String a[]) {
		addDemoReturn b = new addDemoReturn();// created object here
		int result = b.addDemo(45,45);// passing parameter
		System.out.println("Sum of two numbers is "+result);
	}
}
