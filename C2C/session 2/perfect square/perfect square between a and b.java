import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int  n = read.nextInt();
      //  int a[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;    
                int  a = read.nextInt();
                 int  b = read.nextInt();
                       for(int j=a;j<=b;j++){
                         //  int num=j;
                           int squareroot=(int)(Math.sqrt(j));
                           if(squareroot*squareroot==j)
                               count++;
                       }
            
         System.out.println(count);   
                       
        }        
        
    }
}