import java.util.*;
import java.io.*;

class Solution extends LinkedHashMap{
	public static Solution s =new Solution();
	public static LinkedHashMap<Long,String> hm=new LinkedHashMap<>();
	 
   public static void main(String []args)
   {
      Scanner in = new Scanner(System.in);
      
      int n=in.nextInt();
      in.nextLine();
      
      for(int i=0;i<n;i++)
      {
      	 String name=in.nextLine();
         long phone=in.nextLong();
         hm.put(phone,name); 
         in.nextLine();
      }
      
      System.out.println(hm);
   
      	char ch;
     	do{
      	
      	System.out.println("MENU\n1.Add a number\n2.Display reverse mapping\n3.Change a phone number's owner\n4.Quit");
      	int option=in.nextInt();
      	
      	switch(option){
      		case 1: long phone=in.nextLong();
         			if(hm.containsKey(phone)){
              			System.out.println(phone+" = "+hm.get(phone));
         			 }
         			 else{
         			 	 in.nextLine();
         			     System.out.println("Number doesnt exist.Would you like to specify the name?");
         			     String name=in.next();
         			     hm.put(phone,name);
         			 }
      				break;
      		case 2: System.out.println(s);
      				break;
      		case 3: phone=in.nextLong();
      		        in.nextLine();
      				String name=in.nextLine();
      		        hm.put(phone,name);
      				break;
      		case 4: System.exit(0);
      				break;
      		default:System.out.println("\nInvalid option");
      				break;		
      		
      		}
      		
      		System.out.println("Do you wish to continue(Y/N)?");
      		 ch=in.next().charAt(0);
     
    }while(ch=='y'||ch=='Y');	
   }
 @Override  
 public String toString(){
    
    String s=null;
    for (Map.Entry<Long, String> entry : hm.entrySet())
	{
	    s+= Long.toString(entry.getKey()) + " : " + entry.getValue()+"\n";
	} 
     return s;
    }
	
        
}