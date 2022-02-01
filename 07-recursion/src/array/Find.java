package array;

public class Find {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        System.out.println(find(arr, 18, 0));
        System.out.println(findIndex(arr, 18, 0));

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }


    static int findIndex(int[] arr, int target, int index) {

        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

}
