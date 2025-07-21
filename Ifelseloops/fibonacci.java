package Ifelseloops;
import java.util.Scanner;
public class fibonacci {
     public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series: ");
        int n = in.nextInt();

        // Q: Fibonacci series generation ?????

        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        
        System.out.println();
     }
    
}
