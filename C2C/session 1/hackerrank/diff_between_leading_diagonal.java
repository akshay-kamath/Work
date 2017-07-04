import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1=0,sum2=0,diff,i,j;
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for( i=0; i< n; i++){
            for( j=0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }
         for( i=0; i< n; i++){
            for(j=0; j < n; j++){
                if(i==j)
                sum1+=a[i][i] ;
                  if(i+j ==n-1){
                     sum2+=a[i][j];
                 }
            }
        }
        
        
        diff=Math.abs(sum1-sum2);
        System.out.println(diff);
        
    }
}