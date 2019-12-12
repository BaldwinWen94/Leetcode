/*
 * Created By Baldwin Wen
 */

package leetcode.n11_20;

public class No13 {
    public int romanToInt(String s) {
        int result = 0;
        int last = 1000;

        for (int i = 0; i < s.length(); i++) {
            int now = getSymbolValue(s.charAt(i));
            if (now > last) {
                result -= last * 2;
            }
            last = now;
            result += now;
        }

        return result;
    }

    public int getSymbolValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
