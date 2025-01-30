package Atlassian;

import java.util.Arrays;

public class Distance_Value_Between_Two_Arrays_1385_Leetcode {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2) ; 
        // Sort the second array
        int result = 0 ;  
        for(int i = 0 ; i < arr1.length ; i++) { 
            // Two Pointer Binary Search Approach
            int l = 0 ; 
            int r = arr2.length - 1 ; 
            while(l <= r) { 
                int mid = (int)(Math.floor((l + r) / 2  ) );   // find the middle value
                if(Math.abs(arr1[i] - arr2[mid]) <= d) {    // breaking condition given in the question 
                    break ; 
                } 
                else if(arr2[mid] < arr1[i]) {  // left pointer update condition
                    l = mid + 1 ; 
                }  
                else  {  // right pointer update condition
                    r = mid - 1 ; 
                }
            }

            if(l > r) { 
                result++;  
            }
        }
        return result ; 
    }
}
