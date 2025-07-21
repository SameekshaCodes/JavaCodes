package Ifelseloops;
import java.util.*;
public class largest 
{
    public static void main(String[] args)
     {
        int max;
        Scanner in = new  Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

 //Q: largest of three ?????
  if ( a>=b && a>=c)
    {
        max = a;
    }
    else if (b>=a && b>=c)
    {
        max = b;
    }
    else
    {
        max = c;
    }
    System.out.println("Largest number is " + max);
     }
    }
