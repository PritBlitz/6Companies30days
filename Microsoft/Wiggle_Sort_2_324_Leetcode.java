package Microsoft;

import java.util.Arrays;

public class Wiggle_Sort_2_324_Leetcode {
    public void wiggleSort(int[] nums) {
        // Sort the array
        Arrays.sort(nums) ; 

        int n = nums.length ;  
        // create an extra space of size n 
        int[] result = new int[n] ;
        int i = 1 ; 
        // first we keep the pointer at the last element of the array nums 
        int j = n - 1 ; 
        while(i < n ) { 
            result[i] = nums[j] ;
            // increment the pointer by 2 in the result array
            i+=2 ; 
            // decrement the pointer by 1 in the nums array
            j-- ;  
        } 
        i = 0 ; 
        // Now after reaching the end of the array using the prev loop logic ,
        // we place the pointer at 0 instead of 1 and alternatively place the elements again 
        while(i < n ) { 
            result[i] = nums[j] ; 
            i += 2 ; 
            j-- ; 
        }

        for(i = 0 ; i < n ; i++)  { 
            nums[i] = result[i] ; 
        }

    }
}
