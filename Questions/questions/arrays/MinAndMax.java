public class MinAndMax{
    static int min(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }

    static int max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,4,90,6, 83};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }
}