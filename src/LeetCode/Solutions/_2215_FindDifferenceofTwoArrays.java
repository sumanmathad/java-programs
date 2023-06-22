package LeetCode.Solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
 */
public class _2215_FindDifferenceofTwoArrays {
    public static void main(String[] args) {

        int[]nums1={1,2,3,4,5,8};
        int[]nums2={2,4,6,8,10};
        List<List<Integer>>answer = new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for (int i :nums2){
            set.add(i);
        }

        for (int i: nums1){
            if (!set.contains(i)){
                set.add(i);
                l1.add(i);
            }
        }
        answer.add(l1);
        set.clear();

        for (int i :nums1){
            set.add(i);
        }

        for (int i: nums2){
            if (!set.contains(i)){
                set.add(i);
                l2.add(i);
            }
        }
        answer.add(l2);
        System.out.println(answer);
    }



}
