package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//Welcome message
		System.out.println("Welcome to the Calculator");
	
//Explains what choices the user can pick
		System.out.println("Choose which operation you would like:");
		System.out.println("Press 1 for +");
		System.out.println("Press 2 for -");
		System.out.println("Press 3 for /");
		System.out.println("Press 4 for *");

//User picks an operation & closes the scanner
		
		int operationChoice = scanner.nextInt();
		// Validate the user's choice
        if (operationChoice < 1 || operationChoice > 4) {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }
		
//Asking for the two numbers
        
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        scanner.close();
		

//Operation performed based on the choice made in step 1
        double result = 0;
        switch (operationChoice) {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                // Handle division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                }
                break;
            case 4:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            default:
                System.out.println("An unexpected error occurred.");
                break;
        }

	}

}
