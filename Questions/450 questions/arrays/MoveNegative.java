public class MoveNegative {
    static void rearrange(int[] arr){
        int j =0;
        int temp;
        for (int i = 0;i < arr.length; i++ ){
            if (arr[i] < 0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int k : arr){
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {3, 5, -2, -1, 8, -9};
        rearrange(arr);
    }

}
