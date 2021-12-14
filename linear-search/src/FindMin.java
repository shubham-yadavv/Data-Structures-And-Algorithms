public class FindMin {
    public static void main(String[] args) {
        int[] arr = {5,8,2,8,9,3,4,7,6};
        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
