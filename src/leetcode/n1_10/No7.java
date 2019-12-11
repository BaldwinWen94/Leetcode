/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;

public class No7 {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        int flag = x > 0 ? 1 : -1;
        x = x * flag;

        int reverse = 0;

        while (x > 0) {
            if (reverse > 214748364 || (reverse == 214748364 && (flag > 0 ? x > 7 : x > 8))) {
                return 0;
            }

            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }

        return reverse * flag;
    }
}
