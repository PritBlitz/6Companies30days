package Microsoft;

public class Count_number_of_incremovable_subarrays_leetcode_2970 {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0 ; 
        int len = nums.length ; 
        for(int i = 0 ; i < len ; i++) { 
            // for each i , we will check all the subarrays starting from i
            for(int j = i ; j < len ; j++) {  // j is the end of the subarray
                if(isIncreasingSubArray(nums , i , j)) { // if the subarray is increasing
                    count++ ; 
                }
            }
        }
        return count ; 
    }

    public boolean isIncreasingSubArray(int[] arr , int start  , int end ) { 
        int len = arr.length ; 
        int prev  = 0 ; 
        for(int i = 0 ; i < len ; i++) {  // for each element in the array
            if(i <= end && i >= start) {  // if the element is in the subarray
                continue ; 
            }
            if(arr[i] <= prev  ) {  // if the element is not in the subarray and is not increasing
                return false  ; 
            }
            prev = arr[i] ; // update the previous element
        }
        return true ; 
    }
}
