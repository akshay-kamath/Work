import java.util.*;
class Pell{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
        System.out.print("Enter n");
        int n=read.nextInt();
        for(int i=0;i<n;i++){
          int pell=read.nextInt();	
          int ans=pell_m(pell);
          System.out.println("Pell number of "+pell+" is "+ans);

		}
	}

/*	public static int pell_r(int n)
	{
   
   	  if (n == 0) 
      	return 0;
   	  if (n == 1) 
      	return 1;

   		return 2*pell(n-1) + pell(n-2); 
	}*/

	public static int pell_m(int m){
	
		int[] p=new int[m+1];
		p[0]=0;
		p[1]=1;
	
		for(int i=2;i<m+1;i++){
			p[i]=2*p[i-1]+p[i-2];
			System.out.println(p[i]);
		}
		
		
		return p[m];
	}
 } 

