/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatureconverter;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the temperature:");
        double temperature = scanner.nextDouble();

        
        System.out.println("Enter 1 to convert from Celsius to Fahrenheit");
        System.out.println("Enter 2 to convert from Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        
        double convertedTemperature;
        if (choice == 1) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
        } else if (choice == 2) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + convertedTemperature);
        } else {
            System.out.println("Invalid choice. Please enter either 1 or 2.");
        }

        scanner.close();
    }

    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
