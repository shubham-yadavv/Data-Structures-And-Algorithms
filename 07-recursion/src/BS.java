public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 78;
        int result = search(arr, target, 0, arr.length-1);
        System.out.println(result);
    }

    static int search(int[] arr, int target, int s, int e){
        int mid = s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){
            return search(arr,target,s, mid-1);
        }
        else{
            return search(arr, target, mid+1, e);
        }
    }
}