import java.io.*;
import java.util.*;


 class Solution {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       
        int n = read.nextInt();
       
        Stack<String> stack = new Stack<>();
		ArrayList<String> al=new ArrayList<>();
		String str[]=new String[n];
        for(int i=0;i<n;i++){
        	 str[i]=read.next();

        }
        
        System.out.println("After\n");
        for(String s:str){

        	switch(s){
        		case "c5":stack.push("c5");
        		           break;
        		           
        		case "Be6":stack.push("Be6");
        		           break;
        		                     
        		case "Nf3":stack.push("Nf3");
        		           break;
        		           
        		case "undo":
        					al.remove(stack.pop());        
        				   break;
        		
        		case "print":
        		             while(!stack.isEmpty()){
        					     al.add(stack.pop());
        					  }   
                                 Collections.reverse(al);
                                   
        					
        					for(String sr:al)
        						System.out.print(sr+" ");
        						System.out.println();

        						
        					for(String sr:al)
        						stack.push(sr); 
        						al.clear();
        			 						     
        				   break;
        				   
     			default:System.out.println("Invalid");
     					break;		
        		
        	}
 			  
        	
        }
        	
	 
	 }
        
}

