package Walmart;

import java.util.HashMap;
import java.util.Map;

public class Friends_Of_Appropriate_Ages_825_leetcode {
    private boolean canBeFriend(int ageA , int ageB) { 
        if(ageB <= (0.5 * ageA + 7)) { 
            return false ; 
        }
        if(ageB > ageA) { 
            return false ; 
        }
        if(ageB > 100 && ageA < 100) { 
            return false ; 
        }
        return true  ; 
    }
    public int numFriendRequests(int[] ages) {
        Map<Integer , Integer > ageCount = new HashMap<>() ; 
        for(int age : ages) { 
            ageCount.put(age , ageCount.getOrDefault(age , 0 ) + 1) ; 
        }

        int requests = 0 ; 
        for(int ageA : ageCount.keySet() ) { 
            for(int ageB : ageCount.keySet()) { 
                if(!canBeFriend(ageA , ageB)) { 
                    continue ; 
                }
                int countA = ageCount.get(ageA) ; 
                int countB = ageCount.get(ageB) ;
                if(ageA == ageB) { 
                    requests += ((countA - 1) * countA ) ; 
                } 
                else { 
                    requests += (countA * countB) ; 
                }
            }
        }
        return requests ; 
    }
}
