public class Even {
    public static void main(String[] args) {
        int[] nums = {12,345,23,65,7806};
            System.out.println(findNumbers(nums));
//        System.out.println(digits(120));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;

    }

    static int digits(int num) {

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

}
