import java.util.*;

class Main{

      public static void main(String args[]){
	Scanner read=new Scanner(System.in);
  int n=read.nextInt();
  int m=read.nextInt();
  ArrayList<Integer> list1=new ArrayList<>();
  ArrayList<Integer> list2=new ArrayList<>();
  ArrayList<Integer> list3=new ArrayList<>();
  
  for(int i=0;i<n;i++){
      list1.add(read.nextInt());
  }    
  for(int i=0;i<m;i++)
      list2.add(read.nextInt());
      list3.addAll(list1);
      list3.addAll(list2);
Collections.sort(list3);
System.out.println(list3);



	}

}