package longestpalindromicsubstring;

public class SolutionON3{
   public boolean isPalindrom(String s){
    int length= s.length();
    int i = 0;
    int j =length-1;

    while(i<j){
        if (s.charAt(i)!=s.charAt(j)){
            return false;
        }
        else{
            i++;
            j--;
        }
    }
    return true;
   }
   public String longestPalindrome(String s){
    int max_size=0;
    String result = "";
    for (int i =0; i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String subString= s.substring(i,j+1);
            if (isPalindrom(subString) && subString.length()>max_size){
                max_size=subString.length();
                result=subString;
            }
            
        }
        
    }
    return result;
   }


}
