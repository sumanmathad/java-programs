package LeetCode.Solutions;

import java.util.HashMap;
import java.util.TreeMap;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?
 */
public class _0215_FindNthLargestinArray {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{1,3,5,6,0,0,2,-4},3));
    }

    public static int findKthLargest(int[] nums, int k) {
    int el=0;
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
        }
        else
            map.put(nums[i],1);


    }
        System.out.println(map);

    for(Integer i: map.keySet()){
        int count=0;
        while(count<=k){
            count+=map.get(i);
        }
        el=i;
    }
    return el;
    }
}

