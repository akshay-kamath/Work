import java.util.*;

class Main{

      public static void main(String args[]){
	Scanner read=new Scanner(System.in);
	List<Integer> alist=new ArrayList<>();
        List<Integer> llist=new LinkedList<>();
        long start=System.currentTimeMillis();
	for(int i=0;i<1_000_000;i++){
            alist.add(5);
            
	}        
	for(int i=0;i<1_000_000;i++){
            alist.remove(0);
            
	}        
        long end=System.currentTimeMillis();
	System.out.println(end-start);
          start=System.currentTimeMillis();
        for(int i=0;i<1_000_000;i++)
            llist.add(5);
        for(int i=0;i<1_000_000;i++){
            llist.remove(0);
          }
	 end=System.currentTimeMillis();
	System.out.println(end-start);

	}

}