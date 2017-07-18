import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int total=0,average=0;
               int n=read.nextInt();
        int ar[]=new int[n];
           int m=read.nextInt();  
          for(int i=0;i<n;i++){
            ar[i]=0;
        }
        for(int i=0;i<m;i++){
          int a=read.nextInt();
          int b=read.nextInt();
          int k=read.nextInt();
          System.out.println(a+" "+b+" " +k);
                  for(int j=a;j<=b;j++){
                  
                        if(ar[j]==0){
                        ar[j]=k;
                    } 
                       else
                           {
                           ar[j]+=k;
                       }
             }
        }
        for(int i=0;i<n;i++)
        System.out.print(ar[i]+" ");
        System.out.println();
        
         for(int i=0;i<n;i++){
             total+=ar[i];
         }
            average=(int)total/n;                  
          System.out.print(average);                    
        
    }
}