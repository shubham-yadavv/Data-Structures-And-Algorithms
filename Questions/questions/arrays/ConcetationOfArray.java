package arrays;

import java.util.Arrays;

public class ConcetationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}

// create a new array ans which double the length of nums
// nums 1 2 4
// ans = 1 2 4 1 2 4

 // nums = 2 5 6
// ans = 2 5 6 2 5 6