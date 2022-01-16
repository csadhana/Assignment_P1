package com.sl.phase1.practiseproject;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		System.out.println("Enter the Operator");
		char Ope = sc.next().charAt(0);
		double Result = 0;
		switch(Ope)
		{
		case '+':
			Result = firstNumber + secondNumber;
			break;
		case '-':
			Result = firstNumber - secondNumber;
			break;
		case '*':
			Result = firstNumber * secondNumber;
			break;
		case '/':
			Result = firstNumber / secondNumber;
			break;
		case '%':
			Result = firstNumber % secondNumber;
			break;
		}
		System.out.println("The Answer is : " + Result);
		

	}

}
