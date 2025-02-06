package Walmart;

public class Verify_Preorder_Serialization_of_Binary_Tree_331_Leetcode {
    public boolean isValidSerialization(String preorder) {
        String[] nodes  = preorder.split(",") ; 
        int vacancy = 1 ; 
        for(String node : nodes ) { 
            vacancy-- ; 
        
            if(vacancy < 0 ) { 
                return false ; 
            }
            if(!node.equals("#")) { 
                vacancy+=2 ; 
            }

        }   
        return vacancy == 0 ; 
    }
}