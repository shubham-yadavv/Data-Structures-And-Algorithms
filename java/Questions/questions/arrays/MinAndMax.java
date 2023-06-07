import java.util.Arrays;

public class MinAndMax {
    static int min(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    static int[] getMinMax(int[] arr) {
        int[] p = { -1, -1 };
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        p[0] = min;
        p[1] = max;
        return p;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 90, 6, 83 };
        System.out.println(min(arr));
        System.out.println(max(arr));
        System.out.println(Arrays.toString(getMinMax(arr)));
    }
}