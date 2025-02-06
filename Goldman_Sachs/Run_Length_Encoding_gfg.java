package Goldman_Sachs;

public class Run_Length_Encoding_gfg {
    public static String encode(String s) {
        // code here
        StringBuffer sb = new StringBuffer() ; 
        for(int i = 0  ; i < s.length() ; i++) { 
            int count = 1 ; 
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) { 
                count++ ; 
                i++ ; 
            } 
            sb.append(s.charAt(i)) ; 
            sb.append(count) ;
        }
        return sb.toString() ; 
    }
}
