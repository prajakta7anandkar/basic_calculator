package com.calculator;

/* Task 2: Basic Calculator: Create a simple console-based calculator that can perform
basic mathematical operations like addition, subtraction, multiplication,
and division. Allow users to input numbers and choose the operation they
want to perform. */

import java.util.Scanner;
public class basicCalculator 
{
	

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int firstNumber = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        int secondNumber = sc.nextInt();

	        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
	        String operation = sc.next();
	        int result = performOperation(firstNumber, secondNumber, operation);
	        System.out.println("Your answer is: " + result);
	    }

	    public static int performOperation(int firstNumber, int secondNumber, String operation)
	    {
	        int result = 0;
	        if (operation.equals("+")) {
	            result = firstNumber + secondNumber;
	        }
	        else if (operation.equals("-")) {
	            result = firstNumber - secondNumber;
	        }
	        else if (operation.equals("*")) {
	            result = firstNumber * secondNumber;
	        }
	        else if (operation.equals("%")) {
	            result = firstNumber % secondNumber;
	        }
	        else if (operation.equals("/")) {
	            result = firstNumber / secondNumber;
	        }
	        else {
	            System.out.println("Invalid operation");
	        }
	        return result;
	    }
}
