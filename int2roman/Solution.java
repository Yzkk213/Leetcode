package int2roman;

import java.util.HashMap;
import java.util.Map;
// can be faster by adding the values of 4,9,40,90... to the map.(TODO)
class Solution {
    public String intToRoman(int num) {
        String s= String.valueOf(num);
        StringBuilder result=new StringBuilder();
        Map<Integer, Character> map = new HashMap<>();
        map.put(1000, 'M');
        map.put(500, 'D');
        map.put(100, 'C');
        map.put(50, 'L');
        map.put(10, 'X');
        map.put(5, 'V');
        map.put(1, 'I');
        
        int n = (int) Math.pow(10, s.length()-1);
        while(num!=0){
            int x =(num/n);
            if ( x==4 ||x==9){
                result.append(map.get(n));
                if(x==4){
                    result.append(map.get(5*n));
                }
                else{
                    result.append(map.get(10*n));
                }
                num-=x*n;
                n/=10;
            }else{
                if(x<4){
                    char c=map.getOrDefault(n,'I');
                    for(int j=0;j<x;j++){
                        result.append(c);
                    }
                    num-=x*n;
                    n/=10;
                    
                }else{
                   char c=map.getOrDefault((5*n), 'E');
                   result.append(c);
                   num-=5*n;
                }
            }
        }

        return result.toString();
        }
}