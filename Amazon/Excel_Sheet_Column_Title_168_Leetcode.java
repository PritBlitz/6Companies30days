package Amazon;

public class Excel_Sheet_Column_Title_168_Leetcode {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while(columnNumber > 0) {
            // Get the remainder of the column number divided by 26
            columnNumber--;
            int remain = columnNumber%26;
            // Append the character to the result
            result.append((char)((remain + 'A')));
            // Divide the column number by 26
            columnNumber = (columnNumber) / 26;
        }
        
        // Reverse the result and return it
        return result.reverse().toString();


        // Eg : 28 ----- :    28 - 1 = 27 , 27 % 26 = 1 :   1 + 'A' = B
        //  27 / 26 = 1 , 1 - 1 = 0 , 0 % 26 = 0 ,0 + 'A' = A ;  0 / 26 = 0 
        // Therefore we get "BA" as the output
        // Reverse : "AB"
        
    }
}
