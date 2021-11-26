import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        for (int j : arr) {     // for every element in array, print the element
            System.out.print(j + " ");//  here j represents element of the array
        }

        //        System.out.println(arr[5]); // index out of bound error


    }
}
