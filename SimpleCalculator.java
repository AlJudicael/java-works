/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Calculator calculator = new Calculator();

        
        while (true) {
            System.out.println("\nSimple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (choice) {
                case 1:
                    result = calculator.addition(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = calculator.subtraction(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = calculator.multiplication(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = calculator.division(num1, num2);
                    if (Double.isFinite(result)) {
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}

class Calculator {
   
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            return Double.POSITIVE_INFINITY; 
        }
        return num1 / num2;
    }
}
