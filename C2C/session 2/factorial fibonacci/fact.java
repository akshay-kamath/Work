/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factorial{

    public static void main(String args[]){
         Scanner read=new Scanner(System.in);
         int n=read.nextInt();
         int fact=0;
         fact=factorial(n);
        
         System.out.print(" fact of No "+n+" is"+fact);
     }
     
     public static int factorial(int x){
     	if(x==0)
     	 return 1 ;
     	 else 
     	 return (x*factorial(x-1));
     	 
    }

}