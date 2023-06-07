public class Sort012 {

    static void sort(int[] arr) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c0++;
            }

            if (arr[i] == 1) {
                c1++;
            }

            if (arr[i] == 2) {
                c2++;
            }

        }

        int index = 0;

        while (c0 > 0) {
            arr[index++] = 0;
            c0--;
        }

        while (c1 > 0) {
            arr[index++] = 1;
            c1--;
        }

        while (c2 > 0) {
            arr[index++] = 2;
            c2--;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 0, 1 };
        sort(arr);
    }
}