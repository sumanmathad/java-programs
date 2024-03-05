package LeetCode.Solutions.Problems_001_to_100;

import java.util.ArrayList;
import java.util.Arrays;
/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 */
public class _0088_MergeSortedArray {
    public static void main(String[] args) {
    merge(new int[] {1,2,3,0,0},3, new int[]{2,1},2);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
      if(m==0 || n!=0){
          int j=0;
          for(int i=nums1.length-1;i>=m;i--){
              nums1[i]= nums2[j];
              j++;
          }
      }

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
}

}
