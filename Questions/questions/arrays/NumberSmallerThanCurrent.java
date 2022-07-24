import java.util.Arrays;

public class NumberSmallerThanCurrent {

    // brute force
    // time compelxity = O(n^2)
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int small = 0;
            for (int j = 0; j < ans.length; j++) {
                if (nums[j] < nums[i] && j != i) {
                    small++;
                }
            }
            ans[i] = small;

        }
        return ans;
    }

    // optimised solution
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] ans = new int[nums.length];
        int[] temp = new int[101];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]]++;
        }

        for (int i = 1; i <= 100; i++) {
            temp[i] += temp[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = temp[nums[i] - 1];
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent1(arr)));

    }
}
