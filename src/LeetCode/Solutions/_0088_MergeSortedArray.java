package LeetCode.Solutions;

import java.util.ArrayList;
import java.util.Arrays;
/*


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
