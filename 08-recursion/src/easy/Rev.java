package easy;
// reverse number using recursion
public class Rev {
    static void reverse(int n) {
        if (n == 0)
            return;
        reverse(n / 10);
        System.out.print(n % 10);
    }

    public static void main(String[] args) {
        int n = 123;
        reverse(n);
    }
}
