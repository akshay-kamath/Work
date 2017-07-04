/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Array{

    public static void main(String args[]){
         Scanner read=new Scanner(System.in);
         int n=read.nextInt();
          boolean flag=false;
         flag=isOdd(n);
         if(flag)
         System.out.print("No "+n+" is odd");
     }
     
     public static boolean isOdd(int number){
     	if((number%2)==1)
     	 return true;
     //	 else 
     	// return false;
     	 
    }

}