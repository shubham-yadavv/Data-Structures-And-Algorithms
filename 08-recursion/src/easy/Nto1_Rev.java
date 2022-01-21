package easy;

public class Nto1_Rev {
    static void rev(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        rev(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        rev(5);
    }
}
