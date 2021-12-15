package Questions;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        int first = search(nums, target, true);
        if (first == -1) {
            return ans;
        }
        ans[0] = first;
        ans[1] = search(nums, target, false);
        return ans;
    }

     int search(int[] nums, int target, boolean firstIndex) {
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
                 // potential ans found
                ans = mid;
                if (firstIndex) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
             }
         }

         return ans;
    }

}