package LeetCode.Solutions.Problems_101_to_200;

import java.util.ArrayList;
import java.util.List;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class _0136_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
    /******************  List  ******************************/
    public static int singleNumberList(int[] nums) {
        List<Integer> numslist = new ArrayList<>();
        for (Integer i : nums) {
            if (!numslist.contains(i)) {
                numslist.add(i);
            } else numslist.remove(i);
        }
        return numslist.get(0);

    }
    //Time : O(n^2)
    //Space : O(n)


    public static int singleNumber(int[] nums) {



        return 0;
    }

}
