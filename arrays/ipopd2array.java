package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ipopd2array{
    
    public static void main(String[] args) {
       
        //input a 2d array 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        //print the 2d array
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
        }
    }
    
    } 
