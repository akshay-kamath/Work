import java.util.*;
class Calc{
	 public static  void main(String args[]){
	Scanner read=new Scanner(System.in);
	double a, b, d;
	int e,f;
	int option;


	do{
	System.out.println("MENU\n 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit\nEnter your option");
	option =read.nextInt();
	
		switch(option){
		case 1:System.out.println("Enter value for number1");
		       a=read.nextDouble();
		       System.out.println("Enter value for number2");
		       b=read.nextDouble();
		       d=a+b;
		       System.out.println("Addition="+d);
			   break;
		case 2:System.out.println("Enter value for number1");
		       a=read.nextDouble();
		       System.out.println("Enter value for number2");
		       b=read.nextDouble();
		       d=a-b;
			   System.out.println("Subtraction="+d);                  
			   break;	
		case 3:System.out.println("Enter value for number1");
		       a=read.nextDouble();
		       System.out.println("Enter value for number2");
		       b=read.nextDouble();	
		       d=a*b;
		       System.out.println("Multiplication="+d);             
			   break;	
       case 4:System.out.println("Enter value for number1");
		       e=read.nextInt();
		       System.out.println("Enter value for number2");
		       f=read.nextInt();	
		       d=e/f;
		       System.out.println("Division="+d);             
			   break;	
       case 5: System.exit(0);
		      break;
		default:System.out.print("Please enter valid option!!!!!!");
				break;
				
		}
	 }while(option!=5);	
	
	}
}