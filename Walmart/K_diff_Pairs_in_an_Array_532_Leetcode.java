package Walmart;

import java.util.HashMap;
import java.util.Map;

public class K_diff_Pairs_in_an_Array_532_Leetcode {
    public int findPairs(int[] nums, int k) {
        // If the input array is null or empty, or k is less than 0, return 0
        if(nums == null || nums.length == 0 || k < 0) { 
            return 0 ; 
        }

        Map<Integer , Integer> map = new HashMap<>() ; // Create a map to store the frequency of each element
        int count = 0 ; 
        for(int i : nums ) { 
            map.put(i , map.getOrDefault(i , 0  ) + 1) ; // Store the frequency of each element in the map
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()) {  // Traverse the map
            if(k == 0) { 
                if(entry.getValue() >= 2 ) {  // If k is 0, check if the frequency of the element is greater than or equal to 2
                    count++ ; 
                }
            }
            else { 
                if(map.containsKey(entry.getKey() + k)) { // If k is not 0, check if the map contains the key (element + k) 
                    count++ ; 
                }
            }
        } 
        return count ; 
    }
    
}
