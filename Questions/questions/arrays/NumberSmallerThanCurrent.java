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

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
}
