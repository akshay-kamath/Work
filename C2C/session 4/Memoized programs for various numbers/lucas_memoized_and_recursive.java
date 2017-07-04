import java.util.*;
class Lucas{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
        System.out.print("Enter n");
        int n=read.nextInt();
        for(int i=0;i<n;i++){
          int lucas=read.nextInt();	
          int ans=lucas_m(lucas);
          System.out.println("Lucas number of "+lucas+" is "+ans);

		}
	}

/*	public static int lucas_r(int n)
	{
   
   	  if (n == 0) 
      	return 2;
   	  if (n == 1) 
      	return 1;

   		return lucas(n-1) + lucas(n-2); 
	}*/

	public static int lucas_m(int m){
	
		int[] l=new int[m+1];
		l[0]=2;
		l[1]=1;
	
		for(int i=2;i<m+1;i++){
			l[i]=l[i-1]+l[i-2];
			System.out.println(l[i]);
		}
		
		
		return l[m];
	}
 } 

