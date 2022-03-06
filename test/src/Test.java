import java.util.Scanner;

// Ramu has N dishes of different types arranged in a row: A1,A2,…,AN where Ai denotes the type of the ith dish. He wants to choose as many dishes as possible from the given list but while satisfying two conditions:

// He can choose only one type of dish.
// No two chosen dishes should be adjacent to each other.
// Ramu wants to know which type of dish he should choose from, so that he can pick the maximum number of dishes.

class Solution{
   public static void main(String[] args) {
       int t;
        Scanner sc = new Scanner(System.in);   
        t = sc.nextInt();
       while (t-- > 0) {
           int a, b , c ,x, y;
           a = sc.nextInt();
           b = sc.nextInt();
           c = sc.nextInt();
           x = sc.nextInt();
           y = sc.nextInt();
           if ((a+b+c) != (x+y)) {
               System.out.println("NO");
           }
           else {
               System.out.println("YES");
           }

       }
            
   } 
}