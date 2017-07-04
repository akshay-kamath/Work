import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class GCDOverloading{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
  		int b = 18;
 		int c = 36;
  		int n[] = {8, 10, 3};
  		int result = gcd(a,b);
  		System.out.println(result);
  		result = gcd(a,b,c);
 	    System.out.println(result);
        result = gcd(n);
        System.out.println(result);
    }
    
	 static int gcd(int a, int b){
 		 if(b!=0){
 		  return gcd(b , a%b); 
 		 }
 		 else{
  		 return a;
  		}
	 }
 
 	static int gcd(int a, int b, int c){
  		int result1 = gcd(a,b);
 		int result2 = gcd(result1, c);
 		return result2;
	 }
 
 	static int gcd(int[] n){
  	int result1 = gcd(n[0],n[0+1]);
 	 for(int i=2; i<n.length ;i++){
   		//int result1 = gcd(n[i],n[i+1]);
 	  result1 = gcd(result1, n[i]);  
  	}
 	 return result1;
	 }
}