public class Test {
    public static int main(String[] args) {
        int x = 16;
        if (x == 0 || x == 1){
            return x;
        }

        int start = 0, end = x;
        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;

                if (start > x / start) {
                    return mid;
                }
            }
        }

        return start;

    }
}