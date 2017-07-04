import java.util.*;

class Tribonacci{
	public static void main(String args[]){
		
		Scanner read=new Scanner(System.in);
        System.out.print("Enter n");
        int n=read.nextInt();
        
        for(int i=0;i<n;i++){
          int tribonacci=read.nextInt();	
          int ans=tribonacci_m(tribonacci);
          System.out.println("Tribonacci number of "+tribonacci+" is "+ans);

		}
	}

	public static int tribonacci_r(int n)
	{
   
   	  if (n == 1) 
      	return 0;
   	  if (n == 2||n==3) 
      	return 1;
      	
   		return tribonacci_r(n-1) + tribonacci_r(n-2)+tribonacci_r(n-3); 
	}

	public static int tribonacci_m(int m){
	
		int[] t=new int[m+1];
		t[0]=0;
		t[1]=1;
		t[2]=1;
	
		for(int i=3;i<m+1;i++){
			t[i]=t[i-1]+t[i-2]+t[i-3];
			System.out.println(t[i]);
		}
		
		
		return t[m-1];
	}
 } 

