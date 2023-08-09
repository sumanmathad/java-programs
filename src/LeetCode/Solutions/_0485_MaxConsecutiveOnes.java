package LeetCode.Solutions;
/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class _0485_MaxConsecutiveOnes {

    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes( new int[]{1,0,1,1,0,1}));
    }

    public static int maxConsecutiveOnes(int[] nums){
        int count=0,largestCount=0;
        for(int i=0; i< nums.length;i++) {
            if (nums[i] == 1) {
                count++;
            }
            else
            {
                if (largestCount < count) {
                    largestCount = count;
                }
                count = 0;
            }


        }

        return count>largestCount?count:largestCount;
    }

/*
***Alternate solution*****
if(nums[i]==0||i==nums.length-1)
***Alternate solution*****
 */
}
