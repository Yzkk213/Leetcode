package longestpalindromicsubstring;

public class SolutionON2 {
    public String midlleCheck(String s, int i ,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1, j);

       }
       public String longestPalindrome(String s){
        String result = "";
        for (int i =0; i<s.length();i++){
             String subString= midlleCheck(s, i, i);
             if (subString.length()>result.length()) result= subString;
             String subString2 = midlleCheck(s, i, i+1);
             if (subString2.length()>result.length()) result = subString2;  
            }
        return result;
       }
    
    
    }

