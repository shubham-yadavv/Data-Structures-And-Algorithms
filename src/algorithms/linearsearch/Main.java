package algorithms.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23,435,6586,97,56,56,4323,};
        int target = 97;
        int ans = linearsearch(target, arr);
        System.out.println(ans);
    }
    static int linearsearch(int target, int[] arr){
        if (arr.length == 0) {
            return -1;
        }


        for (int index = 0; index < arr.length; index++) {

            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
