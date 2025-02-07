package Microsoft;

import java.util.Arrays;

public class Russian_Doll_Envelopes_354_leetcode {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes == null || envelopes.length == 0 || envelopes[0].length == 0) { 
            return 0 ; 
        }
        Arrays.sort(envelopes , (a , b) -> a[0] - b[0] == 0  ? b[1] - a[1] : a[0] - b[0]  ) ; 
        int[] dp = new int[envelopes.length + 1] ; 
        int len = 0 ; 
        int index = 0 ; 
        Arrays.fill(dp , Integer.MAX_VALUE);
        dp[0] = 0 ; 

        for(int i = 0 ; i < envelopes.length ; i++) { 
            index = Arrays.binarySearch(dp , envelopes[i][1]) ; 
            index = index < 0 ? - 1 - index  : index  ; 
            dp[index] = envelopes[i][1] ; 
            len = Math.max(len , index) ;  
        
        }
        return len ; 
    }
}
