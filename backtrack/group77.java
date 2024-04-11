package backtrack;

import java.util.ArrayList;
import java.util.List;

public class group77 {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    private void backtracking(int n, int k, int start) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - k + path.size() + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        group77 test = new group77();
        List<List<Integer>> result = test.combine(4, 2);
        for (List<Integer> num : result){
            System.out.print("[");
            for (int n : num) {
                System.out.print(n + " ");
            }
            System.out.print("]");
        }
    }
}
