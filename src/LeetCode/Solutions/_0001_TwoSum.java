package LeetCode.Solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

public class _0001_TwoSum {

    public static String returnIndices(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                return (Arrays.toString(new int[]{map.get(complement),i}));
            }
            map.put(nums[i],i);
        }
        //added null return to avoid errors however problem statement doesn't let us return this.
        return null;
    }

    public static void main(String[] args) {
        System.out.println(returnIndices(new int[] {3,4,9,6,7,8,2},16));

    }
}