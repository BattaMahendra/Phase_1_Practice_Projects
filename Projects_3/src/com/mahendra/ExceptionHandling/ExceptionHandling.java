package com.mahendra.ExceptionHandling;

import java.util.Scanner;
public class ExceptionHandling{

	public static void main(String[] args) {
		
		Scanner theScan = new Scanner(System.in);
		
		System.out.println("Enter two numbers (🙏🏽 Please dont enter the second number as 0)");
		
		int firstNumber = theScan.nextInt();
		
		int secondNumber = theScan.nextInt();
		
		new ExceptionHandling().divideNumbers(firstNumber, secondNumber);

	}
	
	void divideNumbers(int firstNumber, int secondNumber) {
		
		int result = 0;
		try {
			result = firstNumber / secondNumber;
			System.out.println("Division is : " + result);
		}
		catch(ArithmeticException ae) {
			System.out.println("Sorry, division by zero not defined yet...");
		}
		
		
	}
	
}
