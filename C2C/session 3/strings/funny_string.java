import java.io.*;
import java.util.*;

 class Solution {
public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
        int n=read.nextInt();
        int i;
        read.nextLine();
        for(i=0;i<n;i++){
           //
            int j,k,no,count;
            String str=read.nextLine();
            char s[]=str.toCharArray();
            no=s.length;
            count=no;
            char r[]=new char[no];
            for(j=no-1;j>=0;j--){
                r[i]=s[j];
       //         System.out.print(r[i]);
            }
             for(j=1 ; j<=no-1 ; j++){
                 if(Math.abs(s[j]-s[j-1])==Math.abs(r[j]-r[j-1]))
                     count--;
             }
            if(count==0)
                System.out.println("Funny");
                else
                System.out.println("Not Funny");
        }
       
   }
}