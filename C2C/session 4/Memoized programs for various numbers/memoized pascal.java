import java.util.*;
class Lucas{
public static void main(String args[]){
	Scanner read=new Scanner(System.in);
        
		long mod = 1000_000_000 + 7;
		
		int T = sc.nextInt();
		
		int[] cases = new int[T];
		
		int maxCase = -1;
		
		for (int i = 0; i < T; i++) {
			cases[i] = sc.nextInt();
			maxCase = Math.max(cases[i], maxCase);
		}
		long[] memoizedFactorials = new long[maxCase + 1];
               pascal[1]=1;
               pascal[0]=1;
               pascal[maxcase]=1;


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