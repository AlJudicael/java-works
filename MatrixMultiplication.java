/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixmultiplication;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of rows and columns of Matrix A:");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        int[][] matrixA = readMatrix("Matrix A", rowsA, colsA, scanner);

        
        System.out.println("Enter the number of rows and columns of Matrix B:");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matrixB = readMatrix("Matrix B", rowsB, colsB, scanner);

        
        int[][] result = multiplyMatrices(matrixA, matrixB);

        
        System.out.println("Result of Matrix Multiplication:");
        printMatrix(result);

        scanner.close();
    }

    
    public static int[][] readMatrix(String name, int rows, int cols, Scanner scanner) {
        System.out.println("Enter elements of " + name + ":");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
