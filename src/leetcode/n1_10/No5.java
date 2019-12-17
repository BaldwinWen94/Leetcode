/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;


public class No5 {
    /*
    TODO: currently using brute-force. Try other solutions later
     */
    public String longestPalindrome(String s) {
        int maxLength = 1;
        String finalResult = "", tmpResult = "";

        if (s.length() == 1) {
            return s;
        }

        for (int i = 1; i <= s.length(); i++) {
            tmpResult = getBestPalindromeForIndex(s, i);
            if (maxLength <= tmpResult.length()) {
                maxLength = tmpResult.length();
                finalResult = tmpResult;
            }
        }
        return finalResult;
    }

    public String getBestPalindromeForIndex(String s, int index) {
        String s1 = oddPalindromeForIndex(s, index - 1);
        String s2 = evenPalindromeForIndex(s, index - 1);

        return s1.length() > s2.length() ? s1 : s2;
    }

    public String oddPalindromeForIndex(String s, int index) {
        int i = 1;
        while (index - i >= 0 && index + i < s.length() && s.charAt(index - i) == s.charAt(index + i)) {
            i++;
        }
        return i == 1 ? String.valueOf(s.charAt(index)) : s.substring(index - i + 1, index + i);
    }

    public String evenPalindromeForIndex(String s, int index) {
        int i = 1;

        String result = "";
        //left
        if (index > 0 && s.charAt(index - 1) == s.charAt(index)) {
            while (index - 1 - i >= 0 && index + i < s.length() && s.charAt(index - 1 - i) == s.charAt(index + i)) {
                i++;
            }
            result = s.substring(index - i, index + i);
        }

        //right
        if (index < s.length() - 1 && s.charAt(index) == s.charAt(index + 1)) {
            while (index - i >= 0 && index + i + 1 < s.length() && s.charAt(index - i) == s.charAt(index + i + 1)) {
                i++;
            }
            result = result.length() > 2 * i - 1 ? result : s.substring(index - i + 1, index + i + 1);
        }

        //not match
        return result;
    }
}
