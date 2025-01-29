package Walmart ;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class Subsequence_with_largest_sum_2099_leetcode {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]> ((a , b) -> (a[0] - b[0])) ; 
        // Creating a Priority Queue , Min Heap Condtion Included 

        // Here we iterate through the input array and then we add the elements to the priority queue if it is less then equal to size of K 
        for(int i = 0 ; i < nums.length ; i++) { 
            pq.offer(new int[]{nums[i] , i}); 
            if(pq.size() > k) { 
                // if it is greater we are polling the minimum element (using min heap) out of the priority queue
                pq.poll() ; 
            }
        }

        // Next we take a Set to insert the Indexes of the elements in the priority queue
        Set<Integer> index = new HashSet<>() ; 

        while(!pq.isEmpty()) { 
            int[] top = pq.poll()   ; 
            // We add the index of the elements in the priority queue to the set
            index.add(top[1]) ; 
        }
        int[] ans = new int[k] ; 
        int p = 0 ; 
        // We iterate through the input array and then we add the elements to the answer array if the index is present in the set
        for(int i = 0 ; i < nums.length ; i++) { 
            if(index.contains(i)) { 
                ans[p] = nums[i] ; 
                p++ ; 
            }

        }
        return ans ; 
    }
}