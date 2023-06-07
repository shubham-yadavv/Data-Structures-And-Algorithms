public class MinimumCostOfChips {

    public static int cost(int[] positions) {
        int even = 0, odd = 0;

        for (int i = 0; i < positions.length; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        int[] positions = { 2, 2, 2, 3, 3 };
        System.out.println(cost(positions));
    }
}

// 2 2 2 3 3

// position 2 = 3 chips, position 3 = 2 chips