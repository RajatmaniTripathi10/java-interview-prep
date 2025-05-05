
import java.util.Arrays;

/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class TwoSumSolution {
   public static void main(String[] args) {
    int[] num1={2,7,11,15};
    int target1=9;
    System.out.println(Arrays.toString(result(num1, target1)));
    int[] num2={3,2,4};
    int target2=6;
    System.out.println(Arrays.toString(result(num2, target2)));
    int[] num3={3,3};
    int target3=6;
    System.out.println(Arrays.toString(result(num3, target3)));
   }
   public static int[]  result(int [] nums,int target){
    for(int i=0;i<=nums.length-1;i++){
        for(int j=i+1;j<=nums.length-1;j++){
            if(nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
        }
    }
    return new int[] {};
   }
    
}