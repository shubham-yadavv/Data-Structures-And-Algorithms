public class Main {
    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        int target = 19;
        int ans = linearSearch(nums, target);
        boolean ans2 = linearSearch2(nums, target);

        System.out.println(ans);
        System.out.println(ans2);
    }

    // search the target and return true or false
    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

}

// time complexity: O(n)
// space complexity: O(1)
// worst case: O(n)