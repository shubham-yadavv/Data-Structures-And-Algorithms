import java.util.Arrays;

public class FirstAndLastPos {
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    static int search(int[] nums, int target, boolean firstIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 5, 7 };
        int target = 3;
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

}
