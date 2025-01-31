package Goldman_Sachs;

import java.util.Stack;

public class Number_Following_a_Pattern_gfg {
    static String printMinNumberForPattern(String S){
        // code here
        int num = 1 ; 
        Stack<Integer> st = new Stack<>() ; // stack to store the numbers
        StringBuilder sb = new StringBuilder() ;    // StringBuilder to store the result
        for(int i = 0 ; i < S.length() ; i++) {  
            st.push(num++) ;        // push the number to the stack
            if(S.charAt(i) == 'I') {  // if the character is I (increasing)
                while(st.size()  > 0) {   
                    sb.append(st.pop()) ;  // pop the element from the stack and append it to the StringBuilder
                }
            }
            
        }
        st.push(num) ; 
        while(st.size() > 0 ) {   // if the stack is not empty
            sb.append(st.pop()) ;  // pop the element from the stack and append it to the StringBuilder
        }
        return sb.toString() ;  // return the StringBuilder as a string
    }
}
