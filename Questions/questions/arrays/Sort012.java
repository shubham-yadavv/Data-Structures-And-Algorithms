import java.util.Arrays;

public class Sort012 {

    static void sort(int[] arr) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0 -> cnt0++;
                case 1 -> cnt1++;
                case 2 -> cnt2++;
            }
        }

        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sort(arr);
    }
}