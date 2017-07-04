import java.util.*;
class Pell{
public static void main(String args[]){
	Scanner read=new Scanner(System.in);
        System.out.print("Enter n");
        int n=read.nextInt();
        for(int i=0;i<n;i++){
          int pell=read.nextInt();	
          int ans=pell(pell);
          System.out.println("pell number of "+pell+"is"+ans);

	}

}

public static int pell(int n)
{
   
   if (n == 0) 
      return 0;
   if (n == 1) 
      return 1;

   return (2*pell(n-1) + pell(n-2)); 
	}
 } 