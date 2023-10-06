package LeetCode.Solutions;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;


/////   TO BE SOLVED /////
/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array
 */
public class _0169_MajorityElement {
    public static void main(String[] args) {

        int[]nums={1,2,2,3,3,4,4,4,5,6};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            } else map.put(nums[i],1);
        }

        int max=0;
        for(int i:map.keySet()){
            max=Math.max(max,map.get(i));
        }
        return max;
    }




}
