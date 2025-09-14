package ThreeSumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff= Integer.MAX_VALUE;
        int result=0;

        for(int i =0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(i<j && j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (Math.abs(sum-target)<diff){
                    diff =Math.abs(sum-target);
                    result=sum;
                }if(sum<target){
                    j++;
                }else if (sum>target){
                    k--;
                }else{
                    return target;
                }
            }   
    

        }


        return result;
    }
}
