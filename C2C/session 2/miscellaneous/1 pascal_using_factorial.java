import java.util.*;

class PascalTriangle {

   public static void print(int row) {
       for (int n = 0; n < row; n++) {
           for (int k = 0; k <= n; k++) {
               System.out.print(nCr(n, r) + " ");
           }
           System.out.println();
       }
   }

   public static int nCr(int n, int r) {
       int num = fact(n);
       int den = fact(r) * fact(n - r);
       int result = (int) (num / den);
       return result;
   }

   public static int fact(int num) {
       int result = 1;
       for (int i = 1; i <= num; i++) {
           result = result * i;
       }
       return result;
   }

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
       int row = read.nextInt();
       print(row);
   }
}
