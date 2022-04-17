import java.util.Arrays;
public class MinimiseTheMaximumDiffBetweenHeights {


  public static void main(String[] args) {
    int[] arr = {6,10};
    int n = arr.length;
    int k = 3;
    System.out.println(minimiseMaxDiff(arr,n,  k));
  }

  public static int minimiseMaxDiff(int[] arr,int n,  int k) {
      Arrays.sort(arr);
      int ans = (arr[n - 1] + k) - (arr[0] + k);

      int tempmax = arr[n - 1] - k;
      int tempmin = arr[0] + k;
      int max, min;

      for (int i = 0; i < n - 1; i++) {
          max = Math.max(tempmax, (arr[i] + k));

          min = Math.min(tempmin, (arr[i + 1] - k));

          if (ans > (max - min)) {
              ans = max - min;
          }
      }
      return ans;
  }
}


