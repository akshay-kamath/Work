import java.util.*;

class Main{

      public static void main(String args[]){
	Scanner read=new Scanner(System.in);
	Set<Integer> hset=new HashSet<>();
        long start=System.currentTimeMillis();
	for(int i=0;i<1_0;i++)
            hset.add(i);
            
        long end=System.currentTimeMillis();
	System.out.println(end-start);
          
     //   for(int i=0;i<1;i++)
             System.out.println(hset);

	}

}