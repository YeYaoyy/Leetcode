package stack;

import java.util.Deque;
import java.util.LinkedList;

public class deque239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(nums[i]);
        }
        int[] result = new int[nums.length - k + 1];
        result[0] = deque.getFirst();

        for (int i = k, j = 1; i < nums.length; i++, j++) {
            if (nums[j - 1] == deque.getFirst()) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] > deque.getLast()) {
                deque.removeLast();
            }
            deque.add(nums[i]);
            result[j] = deque.getFirst();
        }
        return result;
    }

    public static void main(String[] args) {
        deque239 test = new deque239();
        int[] result = test.maxSlidingWindow(new int[]{4, 3, 11}, 3);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
