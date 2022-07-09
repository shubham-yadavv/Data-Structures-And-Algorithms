public class RemoveDuplicateFromSorted {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, };
        System.out.println(removeDuplicates(arr));
    }
}

/*
 * arr = 0 0 1 1 2 2 3 3 4 4
 * k = 5
 * 
 * arr = 0 1 2 3 4 _ _ _ _ _
 */
