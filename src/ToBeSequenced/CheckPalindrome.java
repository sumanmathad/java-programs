package ToBeSequenced;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-929));
    }
    public static boolean isPalindrome(int number){
        int absnumber= Math.abs(number);
        int reverse=0, rem=0;
        while (absnumber!=0){
            rem =absnumber%10;
            reverse = (reverse*10) +rem;
            absnumber=absnumber/10;
        }
        System.out.println(reverse);

        if(reverse==Math.abs(number))
        return true;

        return false;
    }

}
