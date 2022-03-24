import java.util.Arrays;

public class KthMaxMin {

    static void kthMinMax(int[] arr, int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]+ " " + arr[arr.length - k] );
    }
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2,};
        int k = 2;

        kthMinMax(arr, k);
    }
}