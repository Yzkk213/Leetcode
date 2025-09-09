package median2sortedarrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged= new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

       if (merged.length%2==0){
           int index= merged.length/2;
            return ((merged[index])+merged[index-1])/2.0;
        }else{
            int index= merged.length/2;
            return merged[index];
        }
    }

    public double findMedianSortedArraysFast(int[] nums1, int[] nums2) {
           if(nums1.length==0){
            return (nums2.length%2!=0) ? nums2[nums2.length/2] : ((nums2[nums2.length/2]+nums2[(nums2.length/2)-1])/2.0);
           }
           if(nums2.length==0){
            return (nums1.length%2!=0) ? nums1[nums1.length/2] : ((nums1[nums1.length/2]+nums1[(nums1.length/2)-1])/2.0);
           }
           int mergedLength= nums1.length+nums2.length;
           int i=0;
           int j=0;
           int k=0;
           int[] mergedArray= new int[((mergedLength)/2)+1];
           while(i<nums1.length && j<nums2.length && k!=(mergedLength/2)+1){
            if (nums1[i]<nums2[j]){
                mergedArray[k]=nums1[i];
                i++;
                
            }else{
                mergedArray[k]=nums2[j];
                j++;
            }
            k++;
           }
           while (k != (mergedLength / 2) + 1 && i < nums1.length) {
            mergedArray[k++] = nums1[i++];
            }
            while (k != (mergedLength / 2) + 1 && j < nums2.length) {
             mergedArray[k++] = nums2[j++];
             }


           return (mergedLength%2!=0) ? mergedArray[k-1] : ((mergedArray[k-1]+mergedArray[k-2])/2.0);
    }  
}
