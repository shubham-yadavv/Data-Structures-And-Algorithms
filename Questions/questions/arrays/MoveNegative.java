import java.util.Arrays;

public class MoveNegative {

    static void rearranage(int[] arr){
        int j = 0;
        int temp;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0){
                if (i!=j){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5, -3, -2,1,-6};
        rearranage(arr);
        System.out.println(Arrays.toString(arr));
    }
}
