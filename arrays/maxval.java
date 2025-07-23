package arrays;

public class maxval {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};
        
        // Find the maximum value in the array
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        
        // Print the maximum value
        System.out.println("Maximum Value: " + maxValue);
    }
    
}
