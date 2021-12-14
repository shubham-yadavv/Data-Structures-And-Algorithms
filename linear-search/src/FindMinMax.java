public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {5,8,2,8,9,3,4,7,6};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
