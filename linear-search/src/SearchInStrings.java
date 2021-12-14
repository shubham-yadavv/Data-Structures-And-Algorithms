import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "shubham";
        System.out.println(search(str, 'a'));
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search2(str, 'a'));
    }


    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }
        return false;
    }


}