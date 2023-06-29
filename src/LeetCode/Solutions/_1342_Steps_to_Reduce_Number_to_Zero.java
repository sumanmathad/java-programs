package LeetCode.Solutions;
/*
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
public class _1342_Steps_to_Reduce_Number_to_Zero {
    public static void main(String[] args) {
        int num=123;
        System.out.println("Entered num is : "+num);
        int count=0;
        while(num!=0){
            num = num%2==0? num/2 : num-1;
            count++;
        }
        System.out.println(count);

    }
}
