/*
 * Created By Baldwin Wen
 */

package leetcode.n11_20;

public class No12 {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        appendChar(sb, num / 1000, 'M', '#', '#');

        num = num % 1000;
        appendChar(sb, num / 100, 'C', 'D', 'M');

        num = num % 100;
        appendChar(sb, num / 10, 'X', 'L', 'C');

        num = num % 10;
        appendChar(sb, num, 'I', 'V', 'X');

        return sb.toString();
    }

    public void appendChar(StringBuilder sb, int result, char char1, char char5, char char10) {
        switch (result) {
            case 0:
                break;
            case 1:
                sb.append(char1);
                break;
            case 2:
                sb.append(char1).append(char1);
                break;
            case 3:
                sb.append(char1).append(char1).append(char1);
                break;
            case 4:
                sb.append(char1).append(char5);
                break;
            case 5:
                sb.append(char5);
                break;
            case 6:
                sb.append(char5).append(char1);
                break;
            case 7:
                sb.append(char5).append(char1).append(char1);
                break;
            case 8:
                sb.append(char5).append(char1).append(char1).append(char1);
                break;
            case 9:
                sb.append(char1).append(char10);
                break;
        }
    }
}
