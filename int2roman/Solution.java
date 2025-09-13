package int2roman;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String intToRoman(int num) {
        String s= String.valueOf(num);
        StringBuilder result=new StringBuilder();
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        
        int n = (int) Math.pow(10, s.length()-1);
        while(num!=0){
            int x =(num/n);
            if ( x==4 ||x==9){
                result.append(map.get(n*x));
                num-=x*n;
                n/=10;
            }else{
                if(x<4){
                    String c=map.getOrDefault(n,null);
                    for(int j=0;j<x;j++){
                        result.append(c);
                    }
                    num-=x*n;
                    n/=10;
                    
                }else{
                   String c=map.getOrDefault((5*n), null);
                   result.append(c);
                   num-=5*n;
                }
            }
        }

        return result.toString();
        }
}