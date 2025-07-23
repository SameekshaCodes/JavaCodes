package arrays;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Input elements into the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Swap first and last elements
        if (n > 1) {
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
        }
        
        // Print the modified array
        System.out.println("Array after swapping first and last elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        scanner.close();

    }
    
}
