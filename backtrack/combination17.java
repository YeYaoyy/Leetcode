package backtrack;

import java.util.ArrayList;
import java.util.List;

public class combination17 {
    String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if ("".equals(digits)) {
            return result;
        }
        backtracking(digits, 0);
        return result;
    }
    void backtracking(String digits, int start) {
        if (sb.length() == digits.length()) {
            result.add(String.valueOf(sb));
            return;
        }
        String st = str[digits.charAt(start) - '0'];
        for (int i = 0; i < st.length(); i++) {
            sb.append(st.charAt(i));
            backtracking(digits, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        combination17 test = new combination17();
        System.out.println(test.letterCombinations("23"));
    }
}
