package com.demo.add;

class addTwoNumbersParameters {

	void addDemo(int number1,int number2) {
		
		int result=number1+number2;
		System.out.println("Sum of two numbers " + "" + result);
	}

}
public class addTwoNumbersUsingParameters {
	public static void main(String a[]) {
		addTwoNumbersParameters b = new addTwoNumbersParameters();//created object here
		b.addDemo(23,32);//passing parameter
	}
}
