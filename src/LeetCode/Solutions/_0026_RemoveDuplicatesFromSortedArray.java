package LeetCode.Solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class _0026_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 1, 1, 1, 2, 2, 3, 4}));
    }


    public static int removeDuplicates(int[] nums) {
        int k=0;
        LinkedHashSet<Integer> newSet = new LinkedHashSet<>();
        for(int i=0; i<nums.length;i++){
            newSet.add(nums[i]);
        }
        for(Integer i:newSet){
           nums[k] =i;
           k++;
        }
        System.out.println(Arrays.toString(nums));
        return newSet.size();
    }
}
