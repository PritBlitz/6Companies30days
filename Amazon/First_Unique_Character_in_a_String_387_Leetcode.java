package Amazon;

public class First_Unique_Character_in_a_String_387_Leetcode {
    public int firstUniqChar(String s) {
        int[] count = new int[26] ; // count of each character
        for(char ch : s.toCharArray()) {  // here we make it into char array and count the frequency or occurences 
            count[ch - 'a']++ ; // increment the count of the character
            // decription : 'a' - 'a' = 0 , 'b' - 'a' = 1 , 'c' - 'a' = 2 , 'd' - 'a' = 3  ... 'z' - 'a' = 25
        }
        int n = s.length() ; 
        for(int i = 0 ; i < n ; i++) {  // for each character in the string
            char ch = s.charAt(i) ; // get the character
            if(count[ch - 'a'] == 1) {  // if the count of the character is 1
                return i ; // return the index
            }
        }
        return -1 ; // if no unique character is found
    }
}
