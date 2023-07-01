package LeetCode.Solutions;

public class _0744_SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter( new char[]{'a', 'c','e','f'},'x'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length-1]< target)
        {
            return letters[0];
        }
        for(int i=letters.length-2; i>=0; i--){
            if (letters[i]< target){
                return letters[i+1];
            }

        }

        return letters[0];
    }

}

