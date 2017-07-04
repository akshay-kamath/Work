import java.util.*;
class Solution{
	
	public static void main(String args[]){
	 Scanner read=new Scanner(System.in);
	 int n=read.nextInt();
	 HashMap<Integer,String> hm=new HashMap<>();
	 int positions=0;
	 
	 for(int i=0;i<n;i++){
	 	System.out.println("Enter name of employee"+(i+1));
	 	String e_name=read.next();
	 	System.out.println("Enter salary of employee"+(i+1));
	 	int salary=read.nextInt();	
	 	hm.put(salary,e_name);
	 	read.nextLine();	
	 }
	 String str="";
	  for(int sal:hm.keySet()){
	  		str+=Integer.toString(sal)+"";
	  }
	  System.out.println(str);
	  char c[]=str.toCharArray();
		for(int i=0;i<n;i++){
			char ch=c[i];
			for(int j=0;j<n;j++){
				if(c[i]==c[j]){
				 positions++;
				}
			}
		}
	System.out.println(positions);
	
	
	
	
	
	}	
	
	
}