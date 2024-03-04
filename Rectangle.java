/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }

    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}

