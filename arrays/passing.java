package arrays;

import java.util.Arrays;

public class passing {
    
    public static void main(String[] args) {
        int[] rollNumbers = {101, 102, 103, 104, 105};
        
        
        System.out.println(Arrays.toString(rollNumbers));
        change(rollNumbers);
        System.out.println(Arrays.toString(rollNumbers));
    }
     public static int change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
        return 0; // Return type is int, but we are not using the return value
    
}
}

