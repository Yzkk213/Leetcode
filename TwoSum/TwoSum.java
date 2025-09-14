
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> map = new HashMap<>();
    for (int i =0; i<nums.length;i++){
        int val = target -nums[i];
        if (map.containsKey(val)){
            int[] result = new int[2];
            result[0]=i;
            result[1]=map.get(val);
            return result;
        }else{
            map.put(nums[i],i);
        }
    }
     return new int[0];
    }
}