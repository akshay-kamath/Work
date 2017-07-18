import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int a[]=new int[n];
          for (int i = 0; i < n; i++) {
          a[i]=read.nextInt();
          }
        int sum=0,no=0;
        for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            sum += a[j];
            if (sum < 0) {
                no++;
            }
        }
        sum = 0;
    }
        System.out.print(no);

        
        
    }
}








import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        
        int numNegativeSubarrays = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                
                int sum = 0;
                
                for(int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                
                if(sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }
        
        System.out.println(numNegativeSubarrays);
    }
}














