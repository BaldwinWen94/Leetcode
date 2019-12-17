/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;

public class No6 {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }

        // One loop: 2n - 2
        int length = s.length();
        int loopLength = 2 * numRows - 2;

        StringBuilder sb = new StringBuilder();
        int loops = length / loopLength;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= loops; j++) {
                int k = j * loopLength + i;
                if (k < length) {
                    sb.append(s.charAt(k));
                }

                if (i > 0 && i < numRows - 1) {
                    k = j * loopLength + loopLength - i;
                    if (k < length) {
                        sb.append(s.charAt(k));
                    }
                }
            }
        }
        return sb.toString();
    }
}
