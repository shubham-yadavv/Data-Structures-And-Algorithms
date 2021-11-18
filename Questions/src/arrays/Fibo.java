package arrays;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int temp = b + a;
            a = b;
            b = temp;
            count++;

        }


    }
}
