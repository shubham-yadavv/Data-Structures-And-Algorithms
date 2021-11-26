import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {2,6,2,7,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr){
        arr[1] = 99;
    }
}
