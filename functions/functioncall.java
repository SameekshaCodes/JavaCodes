package functions;
import java .util.Scanner;
 public class functioncall 
 {
    public static void main(String[] args) 
    {

        //Q: How to call a function in Java????
         sum();
        

    
    }

    // Function to calculate the sum of two numbers
    public static void sum() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        
        
        System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));
        
        sc.close();
     // Returning the sum, though not used here
        
    }
 }
