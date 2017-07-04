import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
    Scanner read=new Scanner(System.in);
    String str=read.nextLine();
    int sub=0,total=0;
    for( int c = 0 ; c <str.length() ; c++ )
      {
         for(int  i = 1 ; i <= str.length() - c ; i++ )
         {
            sub = Integer.parseInt(str.substring(c, c+i));
            total+=sub;
         }
      }
      total=total%(1000000007);
      System.out.println(total);   
    }
}