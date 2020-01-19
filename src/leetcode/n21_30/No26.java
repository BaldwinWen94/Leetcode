/*
 * Created By Baldwin Wen
 */

package leetcode.n21_30;

public class No26 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int pos = 0, index = 0;

        while (index < length) {
            while (index < length - 1 && nums[index] == nums[index + 1]) {
                index ++;
            }
            nums[pos] = nums[index];
            pos++;
            index++;
        }
        return pos;
    }
}
