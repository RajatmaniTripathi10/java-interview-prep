import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of elements: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        
        // System.out.println("Enter " + n + " numbers (each < 100):");
        // for (int i = 0; i < n; i++) {
        //     System.out.print("Element " + (i + 1) + ": ");
        //     int value = sc.nextInt();
        //     if (value >= 100) {
        //         System.out.println("Error: Value cannot be greater than or equal to 100. Please try again.");
        //         i--; 
        //     } else {
        //         arr[i] = value; 
        //     }
        // }

        // System.out.println("Elements: " + Arrays.toString(arr));

        // int sum = 0;
        // for (int num : arr) {
        //     sum += num;
        // }

        // System.out.println("Total sum: " + sum);
        // System.out.println("Average: " + (double) sum / n);

        ArrayList lst=new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add("Bat");
        System.out.println(lst);
        lst.remove(1);
        lst.remove("Bat");
        System.out.println(lst);
    }

   
    
}
