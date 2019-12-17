/*
 * Created By Baldwin Wen
 */

package leetcode.n11_20;

public class No14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String first = strs[0];

        int pos = 1;
        while (pos <= first.length()) {
            String tmp = first.substring(0, pos);
            boolean flag = true;
            for (String str : strs) {
                if (!str.startsWith(tmp)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            } else {
                pos++;
            }
        }
        return first.substring(0, pos - 1);
    }
}
