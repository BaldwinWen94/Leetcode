/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;

import java.util.HashMap;

/*
    Two Sum
 */
public class No1 {
    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // better solution, since hashmap is o(1)
    public int[] hashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int length = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int minus = target - nums[i];
            if (map.containsKey(minus)) {
                return new int[]{i, map.get(minus)};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
