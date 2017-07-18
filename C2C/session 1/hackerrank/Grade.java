import java.util.*;
class Grade{
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		if(n>100)
		System.out.println("Marks cannot be greater than 100");
		else if(n>=80 && n<=100){
		System.out.println("Scholar grade A");
		}
		else if( n>=60 && n<=79){
		System.out.println("Grade b");
		}
        else if( n>=40 && n<=59){                  
	System.out.println("Grade c");	
		}
		else{
				System.out.println("Fail");	
		}
		
	}
}