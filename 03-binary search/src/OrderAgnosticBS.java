public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {8,6,5,3,2,1};
        int target = 2;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean Asc = arr[start] < arr[end];   // find arr ascending or descending


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;

            }
            if (Asc) {
                if (arr[mid] < target) {
                    start = mid + 1;

                } else if (arr[mid] > target) {
                    end = mid - 1;
                }

            } else {
                if (arr[mid] > target) {
                    start = mid + 1;

                } else if (arr[mid] < target) {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

}
