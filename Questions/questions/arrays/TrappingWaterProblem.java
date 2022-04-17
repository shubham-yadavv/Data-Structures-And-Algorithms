public class TrappingWaterProblem {

    static int trap2(int[] arr, int n ){     // time complexity = O(n), space complexity = O(n)
        int[] left = new int[n];
        int[] right = new int[n];

        int water = 0;

        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 0; i < n; i++){
            water += Math.min(left[i], right[i]) - arr[i];
        }

        return water;
    }


    static int trap(int[] arr, int n){     // time complexity = O(n^2), space complexity = O(1)
        int water = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            water += Math.min(left, right) - arr[i] ;
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        int n = arr.length;
        System.out.println(trap(arr,n));
        System.out.println(trap2(arr, n));

    }
}