class MaxSumOfSubArray{

    static int sum(int[] arr){
        int max = arr[0], max_end = 0;

        for (int i = 0; i < arr.length; i++) {
            max_end = max_end + arr[i];
            if (max < max_end) {
                max = max_end;
            }
            if (max_end < 0) {
                max_end = 0;
            }

        }
        return max;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,-2,5};
        System.out.println(sum(arr));

    }
}