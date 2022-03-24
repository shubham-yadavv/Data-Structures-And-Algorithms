public class UnionOf2Arrays {

    static int union(int[] arr1, int[] arr2, int m, int n){
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i++] + " " );
            }else if(arr2[j] < arr1[i] ){
                System.out.print(arr2[j++] + " ");
            }
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }

        while (i < m){
            System.out.print(arr1[i++] + " ");
        }
        while (j < n){
            System.out.print(arr2[j++] + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 6 };
        int[] arr2 = { 2, 3, 5, 7 };
        union(arr1, arr2, arr1.length, arr2.length);

    }
}