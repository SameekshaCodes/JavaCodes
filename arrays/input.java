package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class input {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of roll numbers: ");
        int n = scanner.nextInt();
        
        int[] rollNumbers = new int[n];
        
        // Input roll numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number " + (i + 1) + ": ");
            rollNumbers[i] = scanner.nextInt();
        }
        
        System.out.println(Arrays.toString(rollNumbers));
        scanner.close();
    }
}
