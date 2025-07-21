package Ifelseloops;
import java.util.Scanner;
public class occurences {
    public static void main(String[] args) {
         
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number  ");
    int n= in.nextInt();
    System.out.println("Enter the digit to count its occurrences: ");
    int digit = in.nextInt();

    // Q: Count occurrences of a digit in a number ?????
    int count = 0;
    while(n>0)
    {
        int d = n % 10; 
        if(d == digit)
        {
            count++;
        }
        n = n / 10;
    }
    if(count > 0) {
        System.out.println("The digit " + digit + " occurs " + count + " times.");
    } else {
        System.out.println("The digit " + digit + " does not occur in the number.");
    }
     
    }
    
}
