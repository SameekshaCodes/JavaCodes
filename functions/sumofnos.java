package functions;
import java.util.Scanner;
public class sumofnos 
{
    public static void main(String[] args) {

        //Q: sum of two numbers????
        // A: This program calculates the sum of two numbers provided by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        int sum = a + b;
        
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        
        sc.close();
    }
    
}
