package functions;
import java.util.Scanner;
public class questions 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));
        System.out.println("now we are printing all the three digit armstrong numbers ");
        System.out.println(printArm());
    }
     
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so n is not prime
            }
        }
        return true;}

      // No divisors found, so n is prime
     static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // Count the number of digits
        
        while (n > 0) {
            int digit = n % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise to the power of number of digits and add to sum
            n /= 10; // Remove the last digit
        }
        
        return sum == original; // Check if the sum of powers equals the original number
    }
    static String printArm() {
        StringBuilder armstrongNumbers = new StringBuilder();
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                armstrongNumbers.append(i).append(" ");
            }
        }
        return armstrongNumbers.toString().trim(); // Return the string of Armstrong numbers
    }
}
