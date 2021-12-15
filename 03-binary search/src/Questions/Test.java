package Questions;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = test(arr);
        System.out.println(ans);
    }

    static int test(int[] arr) {
        return arr[3 % arr.length];
    }
}
