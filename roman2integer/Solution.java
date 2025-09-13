package roman2integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
   public int romanToInt(String s){
    int result=0;
    Map<String, Integer> map = new HashMap<>();
    map.put("M", 1000);
    map.put("CM", 900);
    map.put("D", 500);
    map.put("CD", 400);
    map.put("C", 100);
    map.put("XC", 90);
    map.put("L", 50);
    map.put("XL", 40);
    map.put("X", 10);
    map.put("IX", 9);
    map.put("V", 5);
    map.put("IV", 4);
    map.put("I", 1);
    int i=0;
    while(i<s.length()){
        if(i<s.length()-1){
            StringBuilder str =new StringBuilder();
            str.append(s.charAt(i));
            str.append(s.charAt(i+1));
            if(map.containsKey(str.toString())){
                result+=map.get(str.toString());
                i++;
            }else{
                result+=map.get(String.valueOf(s.charAt(i)));
                
            }
        }else{
            result+=map.get(String.valueOf(s.charAt(i)));
         }  
         i++;
           
        }

    return result;
   }

}
