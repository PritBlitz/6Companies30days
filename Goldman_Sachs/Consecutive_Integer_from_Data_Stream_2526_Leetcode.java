package Goldman_Sachs;

public class Consecutive_Integer_from_Data_Stream_2526_Leetcode {
    private final int value; 
    private final int k; 

    private int lastElem ; 
    private int timesSeen ; 

    public Consecutive_Integer_from_Data_Stream_2526_Leetcode(int value, int k) {
        this.value = value ; 
        this.k = k ; 
    }
    
    public boolean consec(int num) {
        if(lastElem == num) { 
            timesSeen++ ; 
        } else { 
            timesSeen = 1 ; 
        } 
        lastElem = num ;  
        return lastElem == value && timesSeen >= k ; 
    }
}
