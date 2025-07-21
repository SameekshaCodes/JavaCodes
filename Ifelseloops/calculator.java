package Ifelseloops;

public class calculator {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = in.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = in.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        // Q: Simple calculator ?????
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }
        
        System.out.println("Result: " + result);
    }
    
}
