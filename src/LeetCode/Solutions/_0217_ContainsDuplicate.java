package LeetCode.Solutions;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
public class _0217_ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums){
        Set storeSet = new HashSet();
        for(int val:nums){
            if(!storeSet.add(val)){
                return true;
            }
        }


        return false;
    }



}
