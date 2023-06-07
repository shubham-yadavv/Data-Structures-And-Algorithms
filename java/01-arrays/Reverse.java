import java.util.ArrayList;

import javax.sound.midi.VoiceStatus;
import javax.swing.SpinnerDateModel;

class Reverse {

    public static void reverseArray(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        for (int i = 0; i < m; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(n - i - 1));
            arr.set(n - i - 1, temp);
        }

        // print the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

    }

}