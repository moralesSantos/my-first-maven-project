package com.hcl.my_first_maven_project;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Calculator {

	public static void main(String[] args) {

		double num1, num2 = 0;
		Scanner myObj = new Scanner(System.in);

		while (true) {

			BinaryOperation binaryOperation = getAllInputs(myObj);

			switch (binaryOperation.operation) {
			case '+':
				add(binaryOperation.num1, binaryOperation.num2);
				break;
			case '-':
				minus(binaryOperation.num1, binaryOperation.num2);
				break;
			case '*':
				multiply(binaryOperation.num1, binaryOperation.num2);
				break;
			case '/':
				if (binaryOperation.num2 == 0) {
					System.out.println("Cannot divide by zero.");
					System.out.println("Please enter another second number");
					binaryOperation.num2 = myObj.nextDouble();
				}
				divide(binaryOperation.num1, binaryOperation.num2);
				break;
			}
			if (footer(myObj)) {
				break;
			}
		}
	}

	private static boolean footer(Scanner myObj) {

		System.out.println("\nWould you like to continue? (Y/N): ");
		char reply = myObj.next().charAt(0);

		if (reply == 'N' || reply == 'n') {
			System.out.println("Thank You for using my calculator");
			return true;
		}
		return false;
	}

	private static BinaryOperation getAllInputs(Scanner myObj) {

		System.out.println("Enter operation(+, -, *, /):");
		char operation = myObj.next().charAt(0);
		System.out.println("Enter first number:");
		double num1 = myObj.nextDouble();
		System.out.println("Second number:");
		double num2 = myObj.nextDouble();

		BinaryOperation binaryOperation = new BinaryOperation();
		binaryOperation.operation = operation;
		binaryOperation.num1 = num1;
		binaryOperation.num2 = num2;

		return binaryOperation;
	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

	public static void minus(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}

	public static void divide(double num1, double num2) {
		double result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
}

class BinaryOperation {
	char operation;
	double num1;
	double num2;
}