package Google;

public class Integer_to_English_Words_273_Leetcode {
        String[] belowTen = {"" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"} ; 
        String[] belowTwenty = {"Ten" , "Eleven" , "Twelve" , "Thirteen" , "Fourteen" , "Fifteen" , "Sixteen" , "Seventeen" , "Eighteen" , "Nineteen"} ; 
        String[] belowHundred = {"" , "Ten" , "Twenty" , "Thirty" , "Forty" , "Fifty" , "Sixty" , "Seventy" , "Eighty" , "Ninety"} ; 
        public String numberToWords(int num) {
            if(num == 0) { 
                return "Zero" ; 
            }
            if(num < 10) { 
                return belowTen[num] ; 
            }
            if(num < 20) { 
                return belowTwenty[num - 10] ; // eg : 12 - 10 = 2 nd index
            }
            if(num < 100) { // 99 90 
                return belowHundred[num/10] + (num % 10 != 0  ? " " + belowTen[num % 10] : "") ; 
            }
            if(num < 1000) { // 999 = 9 99 ; 9 90 ; 9 00 ; (recursion call) 
                return belowTen[num / 100] + " Hundred" + (num % 100 != 0 ? " " + (numberToWords(num % 100)) : "" ) ;  
    
            }
            if(num < 1000000) { // 9000 ; 999000 -- two recursion calls : 999 000 ; 999 101 ; 999 110
                return numberToWords(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + (numberToWords(num % 1000)) : "" ) ;  
            }
            if(num < 1000000000) { 
                return numberToWords(num / 1000000) + " Million" + (num % 1000000 != 0 ? " " + (numberToWords(num % 1000000)) : "") ;  
            }
            return numberToWords(num / 1000000000) + " Billion" + (num % 1000000000 != 0 ? " " + (numberToWords(num % 1000000000)) : "" ) ; 
    
    
    
            
    
        }
}

