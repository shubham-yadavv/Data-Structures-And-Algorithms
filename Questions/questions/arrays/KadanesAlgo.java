// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

public class KadanesAlgo {
    long maxSubarraySum(int arr[], int n){
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
}
