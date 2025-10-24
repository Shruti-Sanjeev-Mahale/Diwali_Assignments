package com.demo.test.practicequestions;

import java.util.Scanner;

import com.demo.study.exceptions.practicequestions.WrongOperatorException;
import com.demo.study.practicequestions.Calculator;

public class TestCalculator {
	
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter first number: ");
	            int number1 = sc.nextInt();

	            System.out.print("Enter second number: ");
	            int number2 = sc.nextInt();

	            System.out.print("Enter operator (+, -, *, /, %): ");
	            String operator = sc.next();

	            int result = Calculator.calculate(number1, number2, operator);
	            System.out.println("Result = " + result);

	        } catch (WrongOperatorException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Math Error: " + e.getMessage());
	        } finally {
	            sc.close();
	        }
	    }
	}


