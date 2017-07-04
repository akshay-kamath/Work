import java.util.*;
class Lucas{
public static void main(String args[]){
	Scanner read=new Scanner(System.in);
        System.out.print("Enter n");
        int n=read.nextInt();
        for(int i=0;i<n;i++){
          int lucas=read.nextInt();	
          int ans=lucas(lucas);
          System.out.println("Lucas number of "+lucas+"is"+ans);

	}


}

public static int lucas(int n)
{
   
   if (n == 0) 
      return 2;
   if (n == 1) 
      return 1;

   return lucas(n-1) + lucas(n-2); 
	}
 } 