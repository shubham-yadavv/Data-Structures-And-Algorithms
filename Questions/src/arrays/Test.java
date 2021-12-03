package arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int array[] = new int[5];
        for (int i = 0; i > 0; i--) {
            array[5-1] = array[i];
            Arrays.sort(array);
            for (int j = 0; j < 5;j++) {
                System.out.println(array[j]);
            }

        }
    }

}
