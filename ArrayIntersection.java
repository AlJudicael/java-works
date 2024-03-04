/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayintersection;

/**
 *
 * @author user
 */
import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        
        int[] intersection = findIntersection(array1, array2);

        
        System.out.println("Intersection of the two arrays:");
        System.out.println(Arrays.toString(intersection));

        scanner.close();
    }

    
    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        
        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }

        return intersection;
    }
}
