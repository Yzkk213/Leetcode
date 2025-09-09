package longestsubstring;

import java.util.HashSet;

public class SolutionNsquared{
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(" ")) return 1;
        int size=0;
        int max_size=0;
        
        HashSet<Character> seen = new HashSet<>();
        int j =0;
        int i=0;
        while (i<s.length()){
            j=i;
            while(j<s.length()){
            if (seen.contains(s.charAt(j))){
                max_size= Math.max(size, max_size);

                break;
            }else{
                size++;
                seen.add(s.charAt(j));
            }
            j++;
        }
        i++;
        seen=new HashSet<>();
        max_size=Math.max(max_size,size);
        size=0;
        }


    return max_size;
    }
}
