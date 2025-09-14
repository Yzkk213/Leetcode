package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> set = new ArrayList<>();
  


    for(int i =0;i<nums.length;i++){
        if(i>0 &&nums[i]==nums[i-1]) continue;
        int k=nums.length -1;
        int j=i+1;
        while(j<k){
            int sum = nums [i]+nums[j]+nums[k];
            if(sum<0)j++;
            else if(sum>0) k--;
            else{
            set.add(Arrays.asList(nums[i], nums[j], nums[k]));
            j++;
            k--;
            while (j < k && nums[j] == nums[j - 1]) j++;
            while (j < k && nums[k] == nums[k + 1]) k--;
            }
        }

    }

     return set;
}   
}