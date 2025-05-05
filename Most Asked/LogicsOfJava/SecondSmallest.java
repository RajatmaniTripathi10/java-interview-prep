
import java.util.Arrays;



public class SecondSmallest {
   public static void main(String[] args) {
    int [] arr={3,5,1,8,9,2,7,9};
    System.out.println("Original Array : "+Arrays.toString(arr));
    int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
    for(int num:arr){
      if(num<first){
        second=first;
        first=num;
      }
      else if(num<second && num!=first){
        second=num;
      }
    }
    System.out.println("Second smallest : "+(second==Integer.MAX_VALUE?"NOT FOUND":second));
   }
}
