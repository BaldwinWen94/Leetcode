/*
 * Created By Baldwin Wen
 */

package leetcode.n11_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class No17 {
    HashMap<String, String> charList = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        appendNewCombination(result, "", digits);
        return result;
    }

    public void appendNewCombination(List<String> combinations, String prefix, String awaitList) {
        if (awaitList.length() == 0) {
            if (prefix.length() > 0) {
                combinations.add(prefix);
            }
        } else {
            String matchedDigit = charList.get(awaitList.substring(0, 1));
            if (matchedDigit != null) {
                String remainList = awaitList.substring(1);
                for (int i = 0; i < matchedDigit.length(); i++) {
                    appendNewCombination(combinations, prefix + matchedDigit.charAt(i), remainList);
                }
            }
        }
    }
}
