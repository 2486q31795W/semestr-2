package Semestr2;
import java.util.Arrays;
public class Pr26 {
    public static void main(String[] args) {
        String palindrom = palindromeString("aabosobca");
        System.out.println(palindrom + "\n" + palindrom.length());
    }
    public static String palindrome(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    public static String palindromeString(String str) {
        String longest = str.substring(0, 1);
        for (int x = 0; x < str.length() - 1; x++) {
            if (palindrome(str, x, x).length() > longest.length()) {
                longest = palindrome(str, x, x);
            }
            if (palindrome(str, x, x + 1).length() > longest.length()) {
                longest = palindrome(str, x, x + 1);
            }
        }
        return longest;
    }
}
