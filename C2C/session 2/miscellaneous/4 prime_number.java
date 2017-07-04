import java.util.*;
import java.util.*;
class Prime{
	
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a  number");
		int n=read.nextInt();
		boolean flag=false;

		for(int i=2;i<n;i++){
			   
	         if(n%i==0){
                System.out.print("Number "+n+" is not prime");
	         	flag=true;
	         	break;
	         }
	    
		} 
		if(flag==false)
		System.out.print("Number "+n+" is  prime");
	}
	
}