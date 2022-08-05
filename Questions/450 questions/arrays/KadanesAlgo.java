// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

// find contagious sub array with max sum

public class KadanesAlgo {
    static long maxSubarraySum(int[] arr) {
        int max = arr[0], sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };
        System.out.println(maxSubarraySum(arr));
    }
}