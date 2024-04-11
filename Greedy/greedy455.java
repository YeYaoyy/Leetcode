package Greedy;
import java.util.Arrays;

public class greedy455 {
    public int findContentChildren(int[] g, int[] s) {
        int num = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0, j = 0; i < s.length && j < g.length; i++) {
            if (s[i] >= g[j]) {
                num++;
                j++;
            }
        }
        return num;
    }
}
