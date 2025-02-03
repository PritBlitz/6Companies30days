package Microsoft ;

import java.util.ArrayList;

public class Winner_of_Circular_Game_1823_leetcode {

    public int findTheWinner(int n, int k) {
        int index = 0 ; 
        ArrayList<Integer> arr = new ArrayList<>() ; // We create an arraylist to store the elements
        for(int i = 0 ; i < n ; i++) {  // We add the elements to the arraylist
            arr.add(i) ; 

        }
        while(arr.size() > 1) { 
            index = index + ( k - 1) ; // We find the index of the element to be removed
            index = index % arr.size() ;  // maintains the property of circular array
            arr.remove(index) ; // We remove the element from the arraylist
        }
        return arr.get(0) + 1 ; // index + 1 = output
    }
}