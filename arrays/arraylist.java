package arrays;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) 
    {
        ArrayList<Integer> rollNumbers = new ArrayList<>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        System.out.println("Roll Numbers:");
        for (int i = 0; i < rollNumbers.size(); i++) {
            System.out.println("Roll Number: " + rollNumbers.get(i));
        }

    ; // Remove roll number at index 2
        System.out.println("After removal:");
        for (int i = 0; i < rollNumbers.size(); i++) {
            System.out.println("Roll Number: " + rollNumbers.get(i));
        }
    }
}
