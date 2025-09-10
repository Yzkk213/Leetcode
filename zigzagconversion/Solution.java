package zigzagconversion;
//BEATS 90%% RUNTIME AND 97% Memory (Huge increase when switching from Strings to String Builders)
public class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=1 || numRows==1) return s;
        StringBuilder result= new StringBuilder();
        for (int i =0;i<numRows;i++){
            if (i==0 || i == numRows-1){
                for (int k=i;k<s.length();k+=2*numRows-2){
                    result.append(s.charAt(k));
                }
            }else{
                for (int k=i ;k<s.length();){
                    result.append (s.charAt(k));
                    k += (2 * (numRows - i) - 2);
                    if (k<s.length()) 
                        result.append(s.charAt(k));
                    k+=(2*i);
                    
                }
            }  


        }
        return result.toString();
    }
}
