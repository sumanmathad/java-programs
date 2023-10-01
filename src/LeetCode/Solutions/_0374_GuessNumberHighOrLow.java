package LeetCode.Solutions;
/*
We are playing the Guess Game. The game is as follows:
I pick a number from 1 to n. You have to guess which number I picked.
Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
You call a pre-defined API int guess(int num), which returns three possible results:
-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.
 */
public class _0374_GuessNumberHighOrLow {
    static int ans =27;
    public static void main(String[] args) {

        System.out.println(guessNumber(30));
    }

    //Using Ternary Search
    public static int guessNumber(int n) {
        int left=1,right=n;

        while(left<=right){
            int mid1 =left+(right-left)/3;
            int mid2=right-(right-left)/3;

            int res1=guess(mid1);
            int res2=guess(mid2);
            if(res1==0){
                return mid1;
            }
            if (res2==0){
                return mid2;
            }
            else if(res1<0){
                right=mid1-1;
            }
            else if(res2>0){
                left=mid2+1;
            }
            else{
                left=mid1+1;
                right=mid2-1;
            }



        }
        return-1;

    }


    public static int guess(int n){
        if (n == ans) {
            return 0;
        }
        else if(n>ans){
            return -1;
        }
        else return 1;
    }


}
