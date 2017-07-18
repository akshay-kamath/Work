import java.util.*;
class Calc{
	public static void main(String args[]){
	Scanner read=new Scanner(System.in);
	int n =read.nextInt() ;
	int a=read.nextInt();
	int b=read.nextInt();
	int d;
		switch(n){
		case 1:d=a+b;
		       System.out.println(d);
			   break;
		case 2:d=a*b;
			   System.out.println(d);                  
			   break;	
		case 3:d=a-b;
		       System.out.println(d);             
			   break;	
		default:System.out.print("Please enter valid option");
				break;
			
			
			
		}
	
	}
}