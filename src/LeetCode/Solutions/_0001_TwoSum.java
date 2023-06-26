package LeetCode.Solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _0001_TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3}; int target=6;

    Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
        for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            System.out.println(Arrays.toString(new int[]{i, map.get(complement)}));
        }
    }
    // In case there is no solution, we'll just return null
        System.out.println( "No values exist");
}
}