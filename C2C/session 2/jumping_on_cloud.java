import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }
        int min_jumps=0; 
          for(int i=0; i < n-1; ){
            
              if(c[i+1]==0 && c[i+2]==0 ){
                  i+=2;
              }
              else{
                  if(c[i+1]==0 ){
                  i+=1;
              }
              else{
                  i+=2;
              }
           }      
              min_jumps++;
           }
        System.out.print(min_jumps);
     
    }
}
