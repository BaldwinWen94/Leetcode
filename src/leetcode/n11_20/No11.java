/*
 * Created By Baldwin Wen
 */

package leetcode.n11_20;

public class No11 {
    public int bruteForce(int[] height) {
        int max = 0, length = height.length;
        int area;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
