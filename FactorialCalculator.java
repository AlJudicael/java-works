/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialcalculator;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        
        long factorial = calculateFactorial(number);

        
        System.out.println("Factorial of " + number + " = " + factorial);

        scanner.close();
    }

    
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; 
        }
        return n * calculateFactorial(n - 1); 
    }
}

