package backtrack;

import java.util.ArrayList;
import java.util.List;

public class combination216 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> group = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(k, n, 1);
        return result;
    }
    private void backtracking(int k, int n, int start) {
        if (group.size() == k) {
            if (sum == n) {
                result.add(new ArrayList(group));
                return;
            }
            return;
        }
        for (int i = start; i <= 9 - (k - group.size()) + 1; i++) {
            group.add(i);
            sum += i;
            backtracking(k, n, i + 1);
            group.remove(group.size() - 1);

            if (sum >= n) {
                sum = sum - i;
                return;
            }
            sum = sum - i;
        }
    }
}
