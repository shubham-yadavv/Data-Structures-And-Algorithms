package maths;

public class ChocolateWrapper {
    static int countMaxChoco(int money,int price, int wrap) {
        if (money < price)
            return 0;
        int choc = money / price;
        choc = choc + (choc - 1) / (wrap - 1);
        return choc;
    }
    public static void main (String[] args)

    {
        int money = 15;
        int price = 1;
        int wrap = 3 ;
        System.out.println(
                countMaxChoco(money, price, wrap));
    }
}
