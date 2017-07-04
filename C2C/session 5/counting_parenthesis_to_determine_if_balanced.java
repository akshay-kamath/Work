/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.util.*;
class Page{
	
	public static void main(String args[]){

		Scanner read=new Scanner (System.in);
		System.out.println("Enter the  number of test cases");
		int n=read.nextInt();
		read.next();
		
		for(int i=0;i<n;i++){
			
			System.out.println("Enter a string");
			String str=read.nextLine();
			char a[]=new char [str.length()];
			a=str.toCharArray();
			int count1=0;
			for(int j=0;j<a.length;j++){
			if(a[j]=='(')
				count1++;
			if(a[j]==')')
				count1--;
			}
			if(count1==0)
				System.out.println("YES");
			else
			    System.out.println("NO");
		}
		
	}
	
}