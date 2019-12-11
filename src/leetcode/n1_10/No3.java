/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;

import java.util.HashMap;

public class No3 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int j = 0, i = 0; j < s.length(); j++) {
            Character tmp = s.charAt(j);
            if (map.containsKey(tmp)) {
                i = Math.max(map.get(tmp), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(tmp, j + 1);
        }
        return ans;
    }

    // HashSet is another solution
}
