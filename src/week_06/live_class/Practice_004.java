package week_06.live_class;

public class Practice_004 {
    public static void main(String[] args) {
        boolean flag = isStringPalindrome("123321");
        System.out.println(flag);

    }

    public static boolean isStringPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
          return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isStringPalindrome(s.substring(1, s.length() - 1)); //recursive
        }
        return false;
    }
}
