package longestcmnprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_length=Integer.MAX_VALUE;
        boolean equal=true;
      
        for (int i=0;i<strs.length;i++){
            min_length=Math.min(strs[i].length(),min_length);
        }
        int i=0;
        while(i<min_length){
            String prefix= strs[0].substring(0,min_length-i);
            equal =true;
            for (int j=1;j<strs.length;j++){
                if(!(strs[j].substring(0,min_length-i).equals(prefix))){
                    equal=false;
                    break;
                    
                }
            }
            if(equal) return prefix;
            i++;

        }
        return "";
    }

}
