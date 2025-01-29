package Atlassian;

import java.util.Arrays;

public class Assign_Cookies_455_Leetcode {
   
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length ; 
        int m = s.length ; 
        // We take the size of the children and the cookies
        int l = 0 , r = 0 ; 
        Arrays.sort(g) ; 
        Arrays.sort(s) ; 
        // We sort the children and the cookies

        // We iterate through the children and the cookies and then we check if the cookie size is greater than the greed factor of the child
        while(l<n && r< m) {
            // If it is greater we increment the count of the children and the cookies
            if(g[r] <= s[l]) { 
                r++ ; 
            }
            // If it is not greater we increment the count of the cookies
            l++ ; 
        }
        return r ; 
    }
}
