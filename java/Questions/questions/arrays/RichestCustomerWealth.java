
//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        RichestCustomerWealth obj = new RichestCustomerWealth();
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(obj.maximumWealth(accounts));
    }

}
