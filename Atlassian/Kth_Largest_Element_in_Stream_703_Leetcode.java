package Atlassian;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_Stream_703_Leetcode {
    PriorityQueue<Integer> pq ; 
    // Constructor to initialize the object of PriorityQueue
    int k ; 
    public Kth_Largest_Element_in_Stream_703_Leetcode(int k, int[] nums) {
        this.k = k ; 
        // Initialize the Priority Queue
        pq = new PriorityQueue<>() ; 
        // Add the elements to the Priority Queue
        for(int num : nums ) { 
            add(num) ; 
        }
    }
    
    public int add(int val) {
        // If the size of the Priority Queue is less than K or the value is greater than the peek of the Priority Queue
        if(pq.size() < k || val > pq.peek()) { 
            // Add the value to the Priority Queue
            pq.offer(val) ; 
            if(pq.size() > k) { 
                // Remove the smallest element from the Priority Queue
                pq.poll() ; 
            }
        }
        // Return the Kth largest element
        return pq.peek() ; 
    }
}
