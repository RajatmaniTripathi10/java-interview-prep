
import java.util.Arrays;

// Check if an Array is Sorted

public class ArrSorted {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 8, 2, 9};
        // int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        if(isSorted(arr)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
