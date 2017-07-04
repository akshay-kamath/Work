import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class luck_balance {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter n and k");
        int n = read.nextInt();
        int k = read.nextInt();
        long total = 0;
        int luck[]=new int [n];
        int imp[]=new int[n];
        for(int i=0;i<n;i++){
            luck[i]=read.nextInt();
            imp[i]=read.nextInt();
            total+=luck[i];
        }
          Arrays.sort(luck);
        int luckneeded[]=new int [n] ;
        int count=0;
        for(int i=0;i<n;i++){
            if(imp[i]==1){
            	     count+=1;
                     luckneeded[i]=luck[i];
                
            }
        }
        int count1=count-k;
        int temp=0;
        for(int i=0;i<count1;i++){
        	temp+=luckneeded[i];
   System.out.println(temp);
        	}

        total-=(2*temp);
        System.out.println(total);
    
    }
}