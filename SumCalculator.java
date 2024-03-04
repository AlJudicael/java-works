/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumcalculator;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

       
        int sum = calculateSum(num1, num2);

        
        System.out.println("Sum of numbers between " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    
    public static int calculateSum(int num1, int num2) {
        int sum = 0;
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
       
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
}

