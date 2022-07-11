import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#

public class MinimizeHeights {
    int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) {
            return 0;
        }

        Arrays.sort(arr);

        int diff = arr[n - 1] - arr[0];

        int max, min;
        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) {
                continue;
            }
            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            min = Math.min(arr[0] + k, arr[i] - k);
            diff = Math.min(diff, max - min);
        }
        return diff;
    }
}
