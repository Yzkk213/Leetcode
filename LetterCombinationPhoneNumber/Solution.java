package LetterCombinationPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
        public List<String> letterCombinations(String digits) {
        
            if (digits.isEmpty()) return new ArrayList<>();

        Map<Character, String[]> map = new HashMap<>();
        map.put('2', new String[]{"a","b","c"});
        map.put('3', new String[]{"d","e","f"});
        map.put('4', new String[]{"g","h","i"});
        map.put('5', new String[]{"j","k","l"});
        map.put('6', new String[]{"m","n","o"});
        map.put('7', new String[]{"p","q","r","s"});
        map.put('8', new String[]{"t","u","v"});
        map.put('9', new String[]{"w","x","y","z"});

        List<String> result=new ArrayList<>(Arrays.asList( map.get(digits.charAt(0))));
        
        for (int i=1;i<digits.length();i++){
            String[] list_char= map.get(digits.charAt(i));
            List<String> temp1=result;
            result = new ArrayList<>(temp1.size() * list_char.length);
            for (String s : temp1) {
                for (String c : list_char) {
                    result.add(s + c);
                }
            }
    }

        return result;
    }
}
    

