/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;

public class No9 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0, tmp = x;

        while (tmp > 0) {
            reverse = reverse * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return reverse == x;
    }
}
