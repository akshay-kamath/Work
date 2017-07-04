import java.util.*;
class MArray{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
		int sum1=0,sum2=0,sum3=0,sum4=0;
		int n=read.nextInt();
	//	int m=read.nextInt();
		int a[][]=new int[n][n];
	//	int row[]=new int[n];
	//	int col[]=new int[m];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=read.nextInt();
			}
			
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
		       if(i==j)
	           sum1+=a[i][j];
	           if(i+j==n-1)
		       sum2+=a[i][j];
			}
		}
		for(int i=0;i<n;i++){
			sum3=0;
			for(int j=0;j<n;j++){
		       sum3+=a[i][j];
			}
			System.out.println("Sum of row "+i+" is "+sum3);
		}
			for(int j=0;j<n;j++){
			sum4=0;
			for(int i=0;i<n;i++){
		       sum4+=a[i][j];
			}
			System.out.println("Sum of col "+j+" is "+sum4);
		}
		System.out.println(" Sum1= "+sum1+"\nSum2= "+sum2);
		
		
	}	
}