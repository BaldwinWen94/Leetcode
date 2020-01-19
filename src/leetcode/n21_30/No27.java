/*
 * Created By Baldwin Wen
 */

package leetcode.n21_30;

public class No27 {
    public int removeElement(int[] nums, int elem) {
        int m = 0;
        for(int i = 0; i < nums.length; i++){

            if(nums[i] != elem){
                nums[m++] = nums[i];
            }
        }

        return m;
    }
}
