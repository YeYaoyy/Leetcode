package Greedy;

public class subsequence376 {
    public int wiggleMaxLength(int[] nums) {
        int predif = 0;
        int curdif = 0;
        int result = 1;
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 1; i < nums.length; i++) {
            curdif = nums[i] - nums[i - 1];
            if ((curdif > 0 && predif <= 0) || (curdif < 0 && predif >= 0)) {
                result++;
                predif = curdif;
            }
        }
        return result;
    }
}
