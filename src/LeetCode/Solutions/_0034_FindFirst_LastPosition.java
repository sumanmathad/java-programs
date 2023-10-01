package LeetCode.Solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class _0034_FindFirst_LastPosition {

    int[]nums={4,4};
    int target=4;
    @Test
    public void searchRange() {

        int firstOccurrence = this.findBound(nums, target, true);

        if (firstOccurrence == -1) {
            System.out.println(Arrays.toString(new int[]{-1, -1}));
        }

        int lastOccurrence = this.findBound(nums, target, false);

        System.out.println(Arrays.toString(new int[]{firstOccurrence, lastOccurrence}));
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int N = nums.length;
        int begin = 0, end = N - 1;

        while (begin <= end) {

            int mid = (begin + end) / 2;

            if (nums[mid] == target) {

                if (isFirst) {

                    // This means we found our lower bound.
                    if (mid == begin || nums[mid - 1] != target) {
                        return mid;
                    }

                    // Search on the left side for the bound.
                    end = mid - 1;

                } else {

                    // This means we found our upper bound.
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }

                    // Search on the right side for the bound.
                    begin = mid + 1;
                }

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
