package Walmart;

import java.util.Arrays;

public class Rotate_function_396_Leetcode {
    
    public int maxRotateFunction(int[] nums) {
        int sum = Arrays.stream(nums).sum() ; // We find the sum of the array 
        int f = 0 ; 
        for(int i = 0 ; i < nums.length ; i++) {  // we find the value of the initial function without rotate 
            f += i * nums[i] ; 
        }
        int res = f ; // We store the value of the function in res
        for(int i = nums.length - 1 ; i >= 1 ; i--) {  // We iterate through the array and find the maximum value of the function
            res = Math.max(res , sum + f - (nums.length * nums[i])) ; // We find the maximum value of the function
            f = sum + f - (nums.length * nums[i]) ; // We update the value of the function

        }
        return res ; 
    }
}
