package Atlassian;

public class Count_Collisions_on_a_road_2211_leetcode {
    public int countCollisions(String directions) {
        int left = 0 ; 
        int right = directions.length() - 1 ; 
        while(left < directions.length() && directions.charAt(left) == 'L') { // We find the leftmost index of the string 
            left++ ; // We increment the left pointer
        }
        while(right >= 0 && directions.charAt(right) == 'R' ) { // We find the rightmost index of the string
            right-- ; 
        }
        int count = 0 ; 
        for(int i = left ; i <= right ; i++ ) { //  We iterate through the string and find the number of collisions
            if(directions.charAt(i) != 'S') { // If the direction is not straight we increment the count
                count++ ; 
            }
        }
        return count ; 
    }
}
