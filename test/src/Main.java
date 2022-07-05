public class Main {

    public static void main(String[] args) {
        int[] arr = {3,6,6,7,8,24,8,97,2};
        int target = 97;
        System.out.println(binary(arr, target));

    }

    static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
       while (start<=end){
            int mid = start + (end - start) /2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
       return -1;
    }
}


// 3,6,6,7,8,24,8,97,2    s= 3, m = 8, e = 2   (t = 97)
//                          s = m+1
// 24,8,97,2