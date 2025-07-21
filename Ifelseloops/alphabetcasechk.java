package Ifelseloops;
import java.util.Scanner;
public class alphabetcasechk
{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = in.next().trim().charAt(0);

// Q: case checking ????? let's go 


        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        }

        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } 
    
        else {
            System.out.println(ch + " is not a letter.");
        }
        
    }
}