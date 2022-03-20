import java.util.Arrays;

public class Reverse {

    static void reverse(int[] arr, int start, int end){
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void recursiveReverse(int[] arr, int start, int end){
        int temp;
        if (start >= end){
            return;
        }
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recursiveReverse(arr, start+ 1, end-1);
    }

    static void print(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        print(arr, arr.length);

        System.out.println(" recursive reversed array is ");
        recursiveReverse(arr, 0, arr.length-1);
        print(arr, arr.length);

//        System.out.println("non recursive reversed array");
//        reverse(arr, 0, arr.length-1);
//        print(arr, arr.length);

    }
}
