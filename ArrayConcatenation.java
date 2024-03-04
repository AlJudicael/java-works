/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayconcatenation;

/**
 *
 * @author user
 */
import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        
        int[] concatenatedArray = concatenateArrays(array1, array2);
        
        
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
    
    
    public static int[] concatenateArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        
        
        int[] concatenatedArray = new int[length1 + length2];
        
        
        for (int i = 0; i < length1; i++) {
            concatenatedArray[i] = array1[i];
        }
        
        
        for (int i = 0; i < length2; i++) {
            concatenatedArray[length1 + i] = array2[i];
        }
        
        return concatenatedArray;
    }
}
