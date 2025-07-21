package Ifelseloops;

public class reverse {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = in.nextInt();

        // Q: Reverse the number ?????
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        
        System.out.println("Reversed number is: " + reversed);
    }
    
}
