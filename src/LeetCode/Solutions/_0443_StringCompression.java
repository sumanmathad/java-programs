package LeetCode.Solutions;

public class _0443_StringCompression {
    public static void main(String[] args) {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        String s = "";
        int count = 0;
        for (int idx = 0; idx < chars.length; idx++) {

            if (idx == 0) {
                s += chars[idx];
            }


            while (idx != 0 && chars[idx] != s.charAt(s.length() - 1)) {

                if (count > 1) {
                    s = s + count;
                    count = 0;
                    s = s + chars[idx];
                    continue;
                } else {
                    s = s + chars[idx];
                    continue;
                }


            }

            if (chars[idx] == s.charAt(s.length() - 1))
                count++;

        }
        System.out.println(s);
        return s.length();
    }

}
