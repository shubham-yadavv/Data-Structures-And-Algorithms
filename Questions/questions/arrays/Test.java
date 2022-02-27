//package arrays;
//
//public class Test {
//    public static void main(String[] args) {
//    }
//}
//class Solution {
//    public int[][] flipAndInvertImage(int[][] image) {
//
//        int row = image.length;
//        int col = image[0].length;
//        int[][] ans = new int[row][col];
//
//        for(int i = 0; i<row; i++){
//            for(int j = 0; j<col; j++){
//                ans[i][j] = image[i][col-j-1];
//            }
//        }
//    }
//}