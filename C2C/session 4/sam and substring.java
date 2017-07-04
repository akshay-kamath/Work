import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 public class Solution {

    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    String str=read.nextLine();
        char strarr[]=str.toCharArray();
        int n=strarr.length;
        System.out.println(str);
    int total=0;
        int sumOfDigit[]=new int[n];
        sumOfDigit[0]=Integer.parseInt(Character.toString(strarr[0])); 
        System.out.println(sumOfDigit[0]);
        total=sumOfDigit[0];
        System.out.println(total);
         for(int  i = 1 ; i <n  ; i++ )
         {
             int num_i=Integer.parseInt(Character.toString(strarr[i])); 
             System.out.println(num_i);
             sumOfDigit[i]=(i+1)*num_i+10*sumOfDigit[i-1];
            total+=sumOfDigit[i];
         }
      
      total=total%(1000000007);
      System.out.println(total);   
    }
}