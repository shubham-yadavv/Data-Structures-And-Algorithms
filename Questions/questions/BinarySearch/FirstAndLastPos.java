import java.util.ArrayList;

public class FirstAndLastPos {
    public static int lastPos(int[] arr, int target, int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            for (int i = start; i < end; i++) {
                if (target == arr[mid]) {
                    end = mid - 1;
                    ans = mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

    public static int FistPos(int[] arr, int target, int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            for (int i = start; i < end; i++) {
                if (target == arr[mid]) {
                    start = mid + 1;
                    ans = mid;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }

    public static ArrayList<Integer> ans(int[] arr, int target, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(FistPos(arr, target, n));
        list.add(lastPos(arr, target, n));

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 5, 7 };
        int n = arr.length;
        int target = 3;

        System.out.println(ans(arr, target, n));

    }

}
