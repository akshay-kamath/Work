import java.util.*;

class Main{

      public static void main(String args[]){
	Scanner read=new Scanner(System.in);
  String s=read.nextLine();
	String str[]=s.split(" ");
	Set<String> hset=new TreeSet<>();
            for(int i=0;i<str.length;i++)
            hset.add(str[i]);
          
             System.out.println(hset);

	}

}